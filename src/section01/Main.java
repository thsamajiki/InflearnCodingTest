package section01;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        String answer = "";
        loop : while(left < right) {
            for(int i = 0; i < charArray.length / 2; i++) {
                if (str.charAt(i) == str.charAt(charArray.length - 1 - i)) {
                    left++;
                    right--;
                    answer = "YES";
                } else {
                    answer = "NO";
                    break loop;
                }
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