package section07;

import java.io.*;

public class Main {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if (L == n + 1) {
            String temp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    temp += i + " ";
                }
            }

            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        ch = new int[n + 1];
        main.DFS(1);
    }
}