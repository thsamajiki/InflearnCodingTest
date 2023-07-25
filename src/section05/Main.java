package section05;

import java.util.*;
import java.io.*;

public class Main {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for (char x : need.toCharArray()) {
            q.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) { // 필수 과목을 순서대로 이수하지 않음
                    return "NO";
                }
            }
        }

        if (!q.isEmpty()) { // 필수 과목을 이수하지 않음
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String need = br.readLine();
        String plan = br.readLine();

        System.out.println(main.solution(need, plan));
    }
}