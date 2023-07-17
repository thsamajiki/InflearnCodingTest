package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n) {
        int answer = 0;

        int[] array = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    array[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(main.solution(n));
    }
}