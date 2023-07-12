import java.util.*;
import java.io.*;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        for(char ch: str.toCharArray()) {
            if (ch == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char t = br.readLine().charAt(0);

        System.out.println(main.solution(str, t));
    }
}
