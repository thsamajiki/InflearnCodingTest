package section04;

import java.util.*;
import java.io.*;

public class Main {
    public int solution(String a, String b) {
        int answer = 0;
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (char x : b.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }
        int lengthB = b.length();

        for (int i = 0; i < lengthB; i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
        }
        System.out.println("초기");
        System.out.println("aMap : " + aMap);
        System.out.println("bMap : " + bMap);
        System.out.println("================================");

        if (aMap.equals(bMap)) answer++;

        int lengthA = a.length();
        int left = 0;
        for (int right = lengthB; right < lengthA; right++) {
            System.out.println("right : " + right);
            aMap.put(a.charAt(right), aMap.getOrDefault(a.charAt(right), 0) + 1);

            System.out.println("aMap : " + aMap);
            System.out.println("aMap.get(a.charAt(left)) : " + aMap.get(a.charAt(left)));

            if (aMap.get(a.charAt(left)) > 1) {
                System.out.println("경우 1");
                aMap.put(a.charAt(left), aMap.get(a.charAt(left)) - 1);
            } else {
                System.out.println("경우 2");
                aMap.remove(a.charAt(left));
            }

            left++;
            if (aMap.equals(bMap)) answer++;
            System.out.println("left : " + left);
            System.out.println("bMap : " + bMap);
            System.out.println("answer : " + answer);
            System.out.println("================================\n");
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();

        System.out.println(main.solution(S, T));
    }
}