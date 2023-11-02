package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(String str, char c) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(c) || str.charAt(i) == Character.toLowerCase(c)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(main.solution(str, c));
    }
}