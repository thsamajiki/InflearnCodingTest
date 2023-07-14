package section01;

import java.io.*;
import java.util.*;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> reverseWordList = new ArrayList<>();

        for (String word : str) {
            String temp = new StringBuilder(word).reverse().toString();
            reverseWordList.add(temp);
        }

        return reverseWordList;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] wordArr = new String[n];

        for (int i = 0; i < n; i++) {
            wordArr[i] = br.readLine();
        }

        for (String word: main.solution(n, wordArr)) {
            System.out.println(word);
        }
    }
}