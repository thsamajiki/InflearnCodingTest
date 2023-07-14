package section01;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(String s) {
        StringBuilder numStr = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch - '0' >= 0 && ch - '0' < 10) {
                numStr.append(ch);
            }
        }

        int answer = Integer.parseInt(numStr.toString());

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}