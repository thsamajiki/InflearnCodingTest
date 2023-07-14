package section01;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) { // 예 : str = "ksekkset" 일 때, 2번째 k(우변)은 3이지만, str.indexOf(str.charAt(i))(좌변)은 0이므로 중복 문자가 걸러진다.
                answer += str.charAt(i);
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