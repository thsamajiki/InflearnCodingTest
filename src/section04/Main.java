package section04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public char solution(int n, String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        for (char ch : map.keySet()) {
            max = Math.max(max, map.get(ch));
        }

        char answer = 'a';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                answer = entry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(main.solution(n, s));
    }
}