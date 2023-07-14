package section01;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(String s) {
        String answer = "";

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                answer += ch;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}