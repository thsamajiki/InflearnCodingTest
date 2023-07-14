package section01;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();

        for(int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return "NO";
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