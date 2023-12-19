package section06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int count(int[] arr, int dist) {
        int count = 1; // 말이 들어갈 수 있는 좌표의 개수. 처음에 1마리는 배치하기 때문에 무조건 1이 된다.
        int endPoint = arr[0]; // 가장 최근에 말을 배치한 곳의 좌표

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - endPoint >= dist) {
                count++;
                endPoint = arr[i];
            }
        }

        return count;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int left = 1; // 말들 사이의 거리의 최소값은 1
        int right = arr[n - 1]; // 말들 사이의 거리의 최대값은 가장 마지막 좌표보다 작다.

        while (left <= right) {
            int mid = (left + right) / 2; // 가장 가까운 두 말의 최대 거리로 설정한 값
            if (count(arr, mid) >= c) {
                answer = mid; // 배치가능한 말의 수가 c보다 많다면 mid는 값의 후보가 될 수 있다.
                left = mid + 1; // 최대값을 구하고 있기 때문에 mid 이하의 값들은 탐색에서 제외한다.
            } else {
                right = mid - 1; // mid가 c보다 작은 경우, 거리가 더 멀어지면 말이 c 마리만큼 다 들어가지 못하기 때문에 최대 거리를 줄여야 한다
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 마구간의 개수
        int c = Integer.parseInt(st.nextToken()); // 배치할 말의 수

        int[] arr = new int[n]; // 마구간의 좌표들

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(n, c, arr));
    }
}