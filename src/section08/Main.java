package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] board;
    static int answer;
    static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
    static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };
    static Queue<int[]> q = new LinkedList<>();

    private void BFS(int x, int y) {
        q.offer(new int[] { x, y });

        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 8; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 1) {
                    board[nextX][nextY] = 0;
                    q.add(new int[] { nextX, nextY });
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    main.BFS(i, j);
                }
            }
        }

        System.out.println(answer);
    }
}