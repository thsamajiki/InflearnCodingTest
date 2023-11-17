package section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int n) {
        int answer = 0;
        int count = 1;

        n--;

        while (n > 0) {
            count++;
            n = n - count;

            if (n % count == 0) answer++;
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