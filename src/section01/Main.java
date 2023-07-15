package section01;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String s) {
        String answer = "";
        s = s + " "; // 마지막 문자 개수를 제대로 카운트하기 위해 공백문자를 추가함
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                }
                count = 1;
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