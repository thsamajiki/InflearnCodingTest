package section04;

import java.util.*;
import java.io.*;

public class Main {
    public String solution(String s1, String s2) {
        String answer = "";

        char[] chArr1 = s1.toCharArray();
        Arrays.sort(chArr1);

        char[] chArr2 = s2.toCharArray();
        Arrays.sort(chArr2);

        if (Arrays.equals(chArr1, chArr2)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        System.out.println(main.solution(s1, s2));
    }
}