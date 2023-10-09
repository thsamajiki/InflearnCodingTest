package section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int first = stack.pop();
                int second = stack.pop();

                if (x == '+') {
                    stack.push(second + first);
                } else if (x == '-') {
                    stack.push(second - first);
                } else if (x == '*') {
                    stack.push(second * first);
                } else if (x == '/') {
                    stack.push(second / first);
                }
            }
        }

        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}