package section08;

import java.util.*;
import java.io.*;

public class Main {
    static String answer = "NO";
    static int i, n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) {
            System.out.print("      (경우 1) " + "L : " + L + " / ");
            System.out.println(i + "번째 sum : " + sum + " out!");
            return;
        }
        if (sum > total / 2) {
            System.out.print("      (경우 2) " + i + "번째 L : " + L + " / ");
            System.out.println(i + "번째 sum : " + sum + " out!");
            return;
        }
        if (L == n) {
            if (total - sum == sum) {
                System.out.println(i + "번째 YES ");
                answer = "YES";
                flag = true;
            }
        } else {
            System.out.println(i + "번째 왼쪽 (묶기) -> L : " + L + " sum : " + sum);
            i++;
            DFS(L + 1, sum + arr[L], arr);
            System.out.println(i + "번째 오른쪽 (묶지 않기) -> L : " + L + " sum : " + sum);
            i++;
            DFS(L + 1, sum, arr);
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
            total += arr[i];
        }

        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
