package section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {
    int v1;
    int v2;
    int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    static int[] unf;

    public static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken()); // 도시의 개수
        int e = Integer.parseInt(st.nextToken()); // 도로의 개수

        unf = new int[v + 1]; // 인덱스가 도시 번호를 의미, 값이 집합 번호를 의미
        ArrayList<Edge> list = new ArrayList<>();
        for (int i = 1; i <= v; i++) {
            unf[i] = i; // 아직 어떤 집합에 속해있는지 알지 못하기 때문에 인덱스 별로 초기화 해준다.
        }

        for (int i = 1; i <= e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Edge(a, b, c));
        }

        int answer = 0;

        Collections.sort(list);

        for(Edge edge: list) {
            int fv1 = find(edge.v1);
            int fv2 = find(edge.v2);

            if (fv1 != fv2) {
                answer += edge.cost;
                union(edge.v1, edge.v2);
            }
        }

        System.out.println(answer);
    }
}