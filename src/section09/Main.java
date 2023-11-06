package section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Body implements Comparable<Body> {
    int height;
    int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height; // height를 기준으로 내림차순으로 정렬됨
    }
}

public class Main {
    public int solution(ArrayList<Body> list, int n) {
        int count = 0;
        Collections.sort(list);

        int max = 0;

        for (Body body : list) {
            if (body.weight > max) {
                max = body.weight;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Body(h, w));
        }

        System.out.println(main.solution(list, n));
    }
}
