package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static List<int[]> hs, pz;

    public void DFS(int L, int s) {
        if (L == m) {
//            for (int x : combi) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
            int sum = 0;
            for (int[] h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h[0] - pz.get(i)[0]) + Math.abs(h[1] - pz.get(i)[1]));
                }
                sum += dis;
            }

            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        hs = new ArrayList<>();
        pz = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == 1) hs.add(new int[] { i , j });
                else if (temp == 2) pz.add(new int[] { i , j });
            }
        }

        len = pz.size();
        combi = new int[m];

        main.DFS(0, 0);

        System.out.println(answer);
    }
}