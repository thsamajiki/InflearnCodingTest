package section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        List<Stack<Integer>> stackList = new ArrayList<>();

        int length = board.length;

//        System.out.println("length : " + length);

        for (int i = 0; i <= length; i++) {
            if (i == 0) continue;
            stackList.add(new Stack<>());
        }

        for (int i = 1; i < length; i++) {
            for (int j = length - 1; j >= 1; j--) {
                if (board[j][i] != 0) {
//                    System.out.println("board[" + j + "][" + i + "] : " + board[j][i]);
                    Stack<Integer> stackItem = stackList.get(i);
                    stackItem.push(board[j][i]);
                }
            }
        }

        for (int move : moves) {
//            System.out.println("move : " + move);
            Stack<Integer> stack = stackList.get(move);

//            System.out.println("stack : " + stack);

            if (!stack.isEmpty()) {
                int doll = stack.pop();

//                System.out.println("doll : " + doll);

                if (!basket.isEmpty()) {
                    if (basket.peek() == doll) {
//                        System.out.println("여기1");
                        basket.pop();
                        answer += 2;
                    } else {
//                        System.out.println("여기2");
                        basket.push(doll);
                    }
                } else if(basket.isEmpty() || basket.peek() != doll) {
//                    System.out.println("여기3");
                    basket.push(doll);
                }
            }
        }

//        System.out.println("basket : " + basket);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n + 1][n + 1];

//        System.out.println("board's length : " + board.length);

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        System.out.println("board-map");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }

        int m = Integer.parseInt(br.readLine());

        int[] moves = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(board, moves));
    }
}