package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] graph;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int[][] ch;
    static int answer;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (nextX >= 1 && nextX <= 7 && nextY >= 1 && nextY <= 7 && ch[nextX][nextY] == 0 && graph[nextX][nextY] == 0) {
                    ch[nextX][nextY] = 1;
                    DFS(nextX, nextY);
                    ch[nextX][nextY] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        graph = new int[8][8];
        ch = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 7; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ch[1][1] = 1;
        main.DFS(1, 1);

        System.out.println(answer);
    }
}
