package section08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String answer = "NO";
    static int n, total;
    static int[] arr;
    static boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return; // 불필요한 연산 줄이기
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}