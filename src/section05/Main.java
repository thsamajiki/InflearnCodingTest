package section05;

import java.util.*;
import java.io.*;

public class Main {
    public int solution(String str) {
        int answer = 0;

        // 후위표기식
        // 왼쪽에서 부터 순차적으로 읽기 시작한다.
        // 피연산자(숫자)는 일단 지나치고, 연산자(+-*/)가 나오게 되면, 연산자 앞쪽 두 개의 숫자로 연산을 진행한다.

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int right = stack.pop();
                int left = stack.pop();

                if (x == '+') {
                    stack.push(left + right);
                } else if (x == '-') {
                    stack.push(left - right);
                } else if (x == '*') {
                    stack.push(left * right);
                } else if (x == '/') {
                    stack.push(left / right);
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