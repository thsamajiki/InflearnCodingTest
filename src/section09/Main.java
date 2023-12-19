package section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {
    int vex;
    int cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken()); // 도시의 개수
        int e = Integer.parseInt(st.nextToken()); // 도로의 개수

        int[] ch = new int[v + 1]; // 인덱스가 도시 번호를 의미, 값이 집합 번호를 의미
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }

        int answer = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(1, 0));

        while (!pq.isEmpty()) {
            Edge temp = pq.poll();
            int endVertex = temp.vex; // 도착 정점

            if (ch[endVertex] == 0) {
                ch[endVertex] = 1;
                answer += temp.cost;
                
                for(Edge edge: graph.get(endVertex)) {
                    if (ch[edge.vex] == 0) {
                        pq.offer(new Edge(edge.vex, edge.cost));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}