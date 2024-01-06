package section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x: str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}