package section06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // capacity (dvd 용량)을 받아 dvd를 만들면 몇 장으로 만들어지는지를 리턴
    public int count(int[] arr, int capacity) {
        int count = 1; // dvd 개수
        int sum = 0; // dvd의 곡들의 길이의 합
        
        for(int x: arr) {
          if (sum + x > capacity) { // 용량보다 커지면 다음 dvd로 넘어감
              count++;
              sum = x;
          } else { // 용량이 남으면 현재 dvd에 더 넣어줌
              sum += x;
          }
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = -1;

        // stream 내부의 반복자 이용
        int left = Arrays.stream(arr).max().getAsInt(); // 곡의 길이 중 가장 큰 값. 한 dvd에 한 곡만 들어가는 상황이 1개의 최소 크기
        int right = Arrays.stream(arr).sum(); // 곡의 길이를 모두 합한 값, 한 dvd에 모든 곡이 들어가는 상황이 1개의 최대 크기

        while (left <= right) {
            int mid = (left + right) / 2;

            if (count(arr, mid) <= m) { // 충분히 넣을 수 있으면
                answer = mid;
                right = mid - 1;
            } else { // 충분히 넣을 수 없으면
                left = mid + 1; //
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // DVD의 개수

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(n, m, arr));
    }
}