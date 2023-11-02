package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String str) {
        String answer = "";

        String[] words = str.split(" ");
        int max = 0;

        for (String word : words) {
            int length = word.length();
            if (max < length) {
                max = length;
                answer = word;
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