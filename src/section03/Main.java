package section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int m = n / 2 + 1;
        int p1 = 1;

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int p2 = 1; p2 <= m; p2++) {
            sum += arr[p2];
            if (sum == n) answer++;

            while (sum >= n) {
                sum -= arr[p1++];
                if (sum == n) answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(main.solution(N));
    }
}