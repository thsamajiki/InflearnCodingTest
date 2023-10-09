package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] board;
    static int[][] dist;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static Queue<int[]> q = new LinkedList<>();

    public void BFS() {
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 1;
                    q.offer(new int[] { nextX, nextY });
                    dist[nextX][nextY] = dist[nowX][nowY] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    q.offer(new int[] { i, j });
                }
            }
        }

        boolean isAllRipen = true;

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] != 1) {
                    isAllRipen = false;
                    break outer;
                }
            }
        }

        if (isAllRipen) {
            System.out.println(0);
            return;
        }

        main.BFS();

        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                    break outer;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dist[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
