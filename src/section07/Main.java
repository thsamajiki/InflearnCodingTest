package section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] moves = {1, -1, 5};
    static Queue<Integer> q;
    static boolean[] visited;

    public int BFS(int s, int e) {
        int answer = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int now = q.poll();

                for (int j = 0; j < moves.length; j++) {
                    int next = now + moves[j];

                    if (next == e) return answer + 1;

                    if (next >= 1 && next <= 10000 && !visited[next]) {
                        q.offer(next);
                    }
                }
            }
            answer++;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 현수의 위치
        int E = Integer.parseInt(st.nextToken()); // 송아지의 위치

        q = new LinkedList<>();
        visited = new boolean[10001];
        visited[S] = true;
        q.offer(S);

        System.out.println(main.BFS(S, E));
    }
}