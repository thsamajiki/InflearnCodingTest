package section07;

import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static List<List<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);

        while (!q.isEmpty()) {
            int nowV = q.poll();

            for (int nextV : graph.get(nowV)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    q.offer(nextV);
                    dis[nextV] = dis[nowV] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>()); // 이게 중요함
        }

        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        tree.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}