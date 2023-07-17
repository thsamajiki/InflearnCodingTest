package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

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