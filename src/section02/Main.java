package section02;

import java.io.*;
import java.util.*;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numArray = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        for (int num : main.solution(n, numArray)) {
            System.out.print(num + " ");
        }
    }
}