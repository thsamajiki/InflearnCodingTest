package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String s) {
        String answer = "NO";

        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        String temp = new StringBuilder(s).reverse().toString();

        if (s.equals(temp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}