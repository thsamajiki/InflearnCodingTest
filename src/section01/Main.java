package section01;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(String s) {
        int answer = 0; // 0으로 초기화

        for (char ch : s.toCharArray()) {
            if (ch >= 48 && ch <= 57) { // 0(=> 48)부터 9(=> 57)까지의 아스키코드를 이용한 풀이
                answer = answer * 10 + (ch - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}