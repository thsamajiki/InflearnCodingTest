package section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int n, m, answer;
    static ArrayList<ArrayList<Integer>> edges;
    static boolean[] visited;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nextV: edges.get(v)) {
                if (!visited[nextV]) {
                    visited[nextV] = true;
                    DFS(nextV);
                    visited[nextV] = false;
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

        edges = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            edges.get(from).add(to);
        }

        visited = new boolean[n + 1];

        visited[1] = true;
        main.DFS(1);

        System.out.println(answer);
    }
}