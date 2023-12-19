package section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] unf; // 숫자쌍을 담을 배열

    public static int find(int v) { // 해당 학생이 포함된 친구 관계(무리)를 확인
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        // 두 친구가 같은 무리가 아닌 경우,
        // 한 무리의 가장 끝에 위치한 친구가 다른 무리의 가장 끝에 위치한 친구를 바라보도록 하여
        // 두 무리를 하나로 합친다.
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb; // 경로 압축하여 시간 복잡도 감소
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 반 학생수
        int m = Integer.parseInt(st.nextToken()); // 숫자쌍의 개수

        unf = new int[n + 1]; // 인덱스가 학생 번호를 의미, 값이 집합 번호를 의미
        for (int i = 1; i <= n; i++) {
            unf[i] = i; // 아직 어떤 집합에 속해있는지 알지 못하기 때문에 인덱스 별로 초기화 해준다.
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int fa = find(a);
        int fb = find(b);

        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}