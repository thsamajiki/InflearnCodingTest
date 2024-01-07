package section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] distances;
    static boolean[] visited;

    public void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(v);

        while (!q.isEmpty()) {
            int nowV = q.poll();
            
            for(int nextV: graph.get(nowV)) {
                if (!visited[nextV]) {
                    visited[nextV] = true;
                    q.offer(nextV);
                    distances[nextV] = distances[nowV] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점의 수
        m = Integer.parseInt(st.nextToken()); // 간선의 수

        graph = new ArrayList<>();
        distances = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
        }

        visited = new boolean[n + 1];

        visited[1] = true;
        main.BFS(1);

        for(int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distances[i]);
        }
    }
}