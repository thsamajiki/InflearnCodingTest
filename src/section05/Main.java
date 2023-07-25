package section05;

import java.util.*;
import java.io.*;

public class Main {
    public int solution(int n, int k) {
        List<Integer> princeList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            princeList.add(i);
        }

        while(princeList.size() != 1) {
            for (int j = 0; j < k - 1; j++) {
                princeList.add(princeList.get(0));
                princeList.remove(0);
            }

            princeList.remove(0);
        }

        int answer = princeList.get(0);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(main.solution(n, k));
    }
}