package section02;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";

        // 가위, 바위, 보의 정보는 1: 가위, 2: 바위, 3: 보
        // 1. A와 B가 비기는 경우
        // 2. A가 가위로 이기는 경우
        // 3. A가 바위로 이기는 경우
        // 4. A가 보로 이기는 경우
        // 5. 나머지는 B가 이기는 경우
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (char ch : main.solution(n, A, B).toCharArray()) {
            System.out.println(ch);
        }
    }
}