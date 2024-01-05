package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(String s) {
        int answer = 0;

        s = s.replaceAll("[^0-9]", "");

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}