package section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                // list.add(a[p1++]);
                list.add(a[p1]);
                p1++;
            } else {
                // list.add(b[p2++]);
                list.add(b[p2]);
                p2++;
            }
        }

        while (p1 < n) {
            // list.add(a[p1++]);
            list.add(a[p1]);
            p1++;
        }

        while (p2 < m) {
            // list.add(b[p2++]);
            list.add(b[p2]);
            p2++;
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        int[] b = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : main.solution(N, M, a, b)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}