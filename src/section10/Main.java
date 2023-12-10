package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dy;
    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n + 1]; // n + 1번째 위치에 도착해야 건넌 것임 (n번째 돌에 있으면 건넌게 아님)
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dy = new int[n + 2];

        System.out.println(main.solution(n));
    }
}