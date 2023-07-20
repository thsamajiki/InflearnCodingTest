package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) { // i번 학생의 가능한 등수
                    int positionI = 0;
                    int positionJ = 0;
                    for (int s = 0; s < n; s++) { // j번 학생의 가능한 등수
                        if (arr[k][s] == i) {
                            positionI = s; // 이 때 i번 학생의 등수
                        }
                        if (arr[k][s] == j) {
                            positionJ = s; // 이 때 j번 학생의 등수
                        }
                    }

                    if (positionI < positionJ) {
                        count++;
                    }
                }
                if (count == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(n, m, arr));
    }
}