package section05;

import java.util.*;
import java.io.*;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> dollList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    dollList.add(board[j][moves[i] - 1]); // 바구니에 인형을 넣음
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

            if (dollList.size() >= 2 && dollList.get(dollList.size() - 2) == dollList.get(dollList.size() - 1)) {
                dollList.remove(dollList.get(dollList.size() - 1));
                dollList.remove(dollList.get(dollList.size() - 1));
                answer += 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(board, moves));
    }
}