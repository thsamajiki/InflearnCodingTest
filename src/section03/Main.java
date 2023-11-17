package section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int count = 0; // 0을 1로 바꾼 횟수
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (arr[right] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[left] == 0) count--;
                left++;
            }

            answer = Math.max(right - left + 1, answer);
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(N, K, arr));
    }
}