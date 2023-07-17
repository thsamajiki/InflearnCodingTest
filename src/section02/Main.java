package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int temp = 0;
        int maxRow = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp += arr[i][j];
            }
            maxRow = Math.max(maxRow, temp);
            temp = 0;
        }

        int maxCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp += arr[j][i];
            }
            maxCol = Math.max(maxCol, temp);
            temp = 0;
        }

        int maxDiagonal = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i][i];
            maxDiagonal = Math.max(maxDiagonal, temp);
        }
        temp = 0;

        for (int i = 0; i < n; i++) {
            temp += arr[i][n - 1 - i];
            maxDiagonal = Math.max(maxDiagonal, temp);
        }

        int answer = Math.max(maxRow, Math.max(maxCol, maxDiagonal));

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(n, map));
    }
}