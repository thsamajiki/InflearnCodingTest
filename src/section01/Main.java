package section01;

import java.io.*;

public class Main {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for(char ch: str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                sb.append(ch);
            } else {
                ch = Character.toLowerCase(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}
