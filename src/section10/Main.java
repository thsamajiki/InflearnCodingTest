package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dy; // 시간(= 인덱스)에 기록되는 최대 점수가 저장되는 배열

    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];

        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(arr));
    }
}