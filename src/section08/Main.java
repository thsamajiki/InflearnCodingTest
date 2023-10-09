package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int[][] graph;
    static int[][] dist;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { x, y });

        while (!q.isEmpty()) {
            int[] now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];

                if (nextX >= 0 && nextX < 7 && nextY >= 0 && nextY < 7 && graph[nextX][nextY] == 0) {
                    graph[nextX][nextY] = 1;
                    q.offer(new int[] { nextX, nextY });
                    dist[nextX][nextY] = dist[now[0]][now[1]] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        graph = new int[7][7];
        dist = new int[7][7];

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        main.BFS(0, 0);
        if (dist[6][6] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dist[6][6]);
        }
    }
}
