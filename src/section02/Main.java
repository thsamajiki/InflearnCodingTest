package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(n, array));
    }
}