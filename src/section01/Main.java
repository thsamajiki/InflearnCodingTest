package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String s) {
        String answer = "";

        s += " ";

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            char temp = s.charAt(i);

            if (temp == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(temp);
                if (count >= 2) {
                    sb.append(count);
                    count = 1;
                }
            }
        }

        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}