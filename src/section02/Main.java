package section02;

import java.io.*;
import java.util.*;

public class Main {
    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;  // 일의 자리숫자를 찾아냄
                res = res * 10 + t; // 일의 자리숫자를 새로운 변수의 일의 자리수로 옮김
                temp /= 10; // 기존의 일의 자리숫자가 사라짐
            }

            if (isPrime(res)) {
                answer.add(res);
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

        for (int num : main.solution(n, array)) {
            System.out.print(num + " ");
        }
    }
}