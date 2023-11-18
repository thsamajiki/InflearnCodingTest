package section04;

import java.util.*;
import java.io.*;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        int left = 0;

        for (int right = k - 1; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            answer.add(map.size());

            map.put(arr[left], map.get(arr[left]) - 1);

            if (map.get(arr[left]) == 0) map.remove(arr[left]);
            left++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : main.solution(N, K, arr)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}