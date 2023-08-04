package section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] fibo;

    public int DFS(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }

        if (n == 1 || n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fibo = new int[n + 1]; // 인덱스 0은 필요 없음. 각 인덱스는 숫자에 대응, 인덱스에 대한 값은 피보나치 값에 대응

        main.DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}