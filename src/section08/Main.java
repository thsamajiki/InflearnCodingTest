package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int[][] graph;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int[][] ch;
    static int answer;

    public void DFS(int x, int y) {
        if (x == 6 && y == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (nextX >= 0 && nextX < 7 && nextY >= 0 && nextY < 7 && ch[nextX][nextY] == 0 && graph[nextX][nextY] == 0) {
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

        graph = new int[7][7];
        ch = new int[7][7];

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ch[0][0] = 1;
        main.DFS(0, 0);

        System.out.println(answer);
    }
}
