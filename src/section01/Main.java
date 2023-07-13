package section01;

import java.io.*;

public class Main {
    public String solution(String str) {
        String[] words = str.split(" ");

        int maxLength = 0;
        String maxWord = "";
        for(String word: words) {
            if (maxLength < word.length()) {
                maxLength = word.length();
                maxWord = word;
            }
        }

        return maxWord;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}