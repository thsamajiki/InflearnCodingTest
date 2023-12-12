package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] dy; // 시간(= 인덱스)에 기록되는 최대 점수가 저장되는 배열
    public int solution(int[] scores, int[] times) {
        for (int i = 0; i < n; i++) {
            int score = scores[i];
            int time = times[i];
            for (int j = m; j >= time; j--) { // 개수가 정해져 있을 때, 종류마다 1개씩 존재, 유한개면 뒤에서부터 해결한다.
                dy[j] = Math.max(dy[j], dy[j - time] + score);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dy = new int[m + 1];

        int[] scores = new int[m + 1];
        int[] times = new int[m + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            scores[i] = score;
            times[i] = time;
        }

        System.out.println(main.solution(scores, times));
    }
}