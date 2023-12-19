package section08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    // 1 1 1 1 ~ 4 4 4 4 이지만 중복값이 제거되므로 1 2 3 4 부터 시작해서 4 3 2 1 까지 최종값이 16이면 종료
    public void DFS(int L, int sum) {
        if (flag) return;

        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            // i는 순열의 원소 자체이므로 1 ~ n까지("가장 윗줄에 1부터 n까지의 숫자가~") 돌아야 함
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        b = new int[n]; // combi 값 저장 (이항계수를 저장)
        p = new int[n]; // 순열 저장
        ch = new int[n + 1]; // ch : 중복되지 않는 순열이므로 ch가 필요함

        // b 배열에는 3C0, 3C1, 3C2, 3C3 값이 저장된다.
        for (int i = 0; i < n; i++) {
            b[i] = main.combi(n - 1, i);
        }

        main.DFS(0, 0);
        System.out.println();
    }
}