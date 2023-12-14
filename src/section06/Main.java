package section06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int x: arr) {
            int position = -1;
            for (int i = 0; i < size; i++) { // Cache Hit (이미 해당 원소(x)가 캐시 메모리에 있으면)
                if (x == cache[i]) position = i;
            }
            if (position == -1) { // Cache Miss 해당 원소(x)가 캐시 메모리에 없으면
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = position; i >= 1; i--) { // Cache Hit (이미 해당 원소(x)가 캐시 메모리에 있으면)
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }

        return cache;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : main.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}