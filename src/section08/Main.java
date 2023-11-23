package section08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void solution(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        if (L == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            solution(L + 1, sum + arr[L], arr);
            solution(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        main.solution(0, 0, arr);
        System.out.println(answer);
    }
}