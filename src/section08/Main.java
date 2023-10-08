package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int N, M, answer = 0;

    private void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > M) {
            return;
        }
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        main.DFS(0, 0, 0, a, b);

        System.out.println(answer);
    }
}
