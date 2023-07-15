package section01;

import java.io.*;
import java.util.*;

public class Main {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int cursor = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                cursor = 0;
                answer[i] = cursor;
            } else {
                cursor++;
                answer[i] = cursor;
            }
        }

        cursor = 1000; // 다시 초기화해야 함
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == t) {
                cursor = 0; // t에는 이미 0이 있으므로 굳이 answer[i] = cursor를 할 필요는 없음
            } else {
                cursor++;
                answer[i] = Math.min(answer[i], cursor);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char target = st.nextToken().charAt(0);

        for (int distance : main.solution(str, target)) {
            System.out.print(distance + " ");
        }
    }
}