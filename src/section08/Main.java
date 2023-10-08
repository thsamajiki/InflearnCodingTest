package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int C, N, answer = 0;
    static int[] ch;

    public void DFS(int L, int sum, int[] weights) {
        if (sum > C) {
            return;
        }
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + weights[L], weights);
            DFS(L + 1, sum, weights);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int[] weights = new int[N];
        ch = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = Integer.parseInt(br.readLine());;
        }

        main.DFS(0, 0, weights);

        System.out.println(answer);
    }
}
