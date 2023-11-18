package section04;

import java.util.*;
import java.io.*;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());
        
        int left = 0;

        System.out.println("초기");
        System.out.println("map : " + map);
        System.out.println("answer : " + answer);
        System.out.println("========================\n");

        for (int right = k; right < n; right++) {
            System.out.println("right : " + right);
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            System.out.println("map - key : " + arr[right] + " / value : " + map.getOrDefault(arr[right], 0));

            if (map.get(arr[left]) > 1) {
                System.out.println("경우 1");
                map.put(arr[left], map.get(arr[left]) - 1);
            } else {
                System.out.println("경우 2");
                map.remove(arr[left]);
            }

            System.out.println("map : " + map);

            left++;
            System.out.println("left : " + left);
            answer.add(map.size());
            System.out.println("answer : " + answer);
            System.out.println("=======================\n");
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