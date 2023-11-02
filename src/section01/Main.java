package section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder(str[i]);
            answerList.add(sb.reverse().toString());
        }

        return answerList;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        for (String word : main.solution(n, str)) {
            System.out.println(word);
        }
    }
}