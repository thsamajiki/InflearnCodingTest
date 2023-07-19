package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) { // i번 학생
            int count = 0;
            for (int j = 1; j <= n; j++) { // j번 학생
                for (int k = 1; k <= 5; k++) {  // k : 학년
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(n, arr));
    }
}