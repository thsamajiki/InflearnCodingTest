package section08;

import java.util.*;
import java.io.*;

public class Main {
    static int N, M, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > M) {
            return; // 스택 오버플로우 방지
        }
        if (L >= answer) {
            return;
        }
        if (sum == M) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        M = Integer.parseInt(br.readLine());
        
        main.DFS(0, 0, arr);

        System.out.println(answer);
    }
}
