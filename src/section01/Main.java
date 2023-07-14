package section01;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자 A-Z가 아니면 ""로 대체함

        String reverseS = new StringBuilder(s).reverse().toString();

        if (s.equals(reverseS)) {
            answer = "YES";
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