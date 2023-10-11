package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int s, e;
    static int answer;
    static int[] moves = { 1, -1, 5 };
    static int[] ch;

    private void BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);

        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int now = q.poll();

                for (int j = 0; j < moves.length; j++) {
                    int next = now + moves[j];

                    if (next == e) {
                        answer++;
                        return;
                    }
                    if (next >= 1 && next <= 10000 && ch[next] == 0) {
                        ch[next] = 1;
                        q.offer(next);
                    }
                }

            }
            answer++;
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        main.BFS(s, e);

        System.out.println(answer);
    }
}