package section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int answer = 1;
    public void solution(int n) {
        if (n == 0) {
            return;
        } else {
            solution(n - 1);
            answer *= n;
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        main.solution(n);
        System.out.println(answer);
    }
}