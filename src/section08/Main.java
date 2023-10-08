package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] pm;

    public void DFS(int L) {
        if (L == M) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pm = new int[M];
        
        main.DFS(0);
    }
}
