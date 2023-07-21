package section04;

import java.util.*;
import java.io.*;

public class Main {
    public String solution(String s1, String s2) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) { // 키값이 하나라도 0이 아니면 아나그램이 아니다.
                return "NO";
            } else {
                map.put(ch, map.get(ch) - 1);   // 키값이 모두 0이면 아나그램이다.
            }
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