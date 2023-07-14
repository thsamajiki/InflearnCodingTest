package section01;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (charArray[left] < 65 || (charArray[left] >= 91 && charArray[left] < 97) || charArray[left] >= 123) {
                left++;
            } else if (charArray[right] < 65 || (charArray[right] >= 91 && charArray[right] < 97) || charArray[right] >= 123) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        String reverseWord = String.valueOf(charArray);

        return reverseWord;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}