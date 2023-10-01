package section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for (char x : need.toCharArray()) {
            q.offer(x);
        }

        for (char y : plan.toCharArray()) {
            if (q.contains(y)) {
                if (y != q.poll()) {
                    return "NO";
                }
            }
        }

        if (!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String p = br.readLine();

        System.out.println(main.solution(n, p));
    }
}