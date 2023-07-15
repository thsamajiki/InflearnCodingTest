package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 1;

        // 130, 135, 148, 140, 145, 150, 150, 153
        int maxHeight = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxHeight < arr[i]) {
                maxHeight = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] heightArray = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            heightArray[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(n, heightArray));
    }
}