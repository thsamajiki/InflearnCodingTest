package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2);

            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(main.solution(n, str));
    }
}