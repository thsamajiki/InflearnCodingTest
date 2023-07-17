package section02;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[] arr) {
        int[] scoreArray = new int[arr.length];
        if (arr[0] == 1) {
            scoreArray[0] = 1;
        } else {
            scoreArray[0] = 0;
        }

        int answer = scoreArray[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                scoreArray[i + 1] = 0;
            } else if (arr[i] == 0 && arr[i + 1] == 0) {
                scoreArray[i + 1] = 0;
            } else {
                scoreArray[i + 1] = scoreArray[i] + 1;
            }

            answer += scoreArray[i + 1];
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