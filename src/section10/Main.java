package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Brick implements Comparable<Brick> {
    int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }


    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class Main {
    static int[] dy;
    public int solution(ArrayList<Brick> arrayList) {
        int answer = 0;
        Collections.sort(arrayList);
        dy[0] = arrayList.get(0).h;
        answer = dy[0]; // n개의 탑을 쌓지 못하고 각각 두어야 하는 경우가 있을 수 있어서 dy[0]으로 초기화한다.

        for (int i = 1; i < arrayList.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arrayList.get(j).w > arrayList.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arrayList.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Brick> arrayList = new ArrayList<>();

        dy = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arrayList.add(new Brick(s, h, w));
        }

        System.out.println(main.solution(arrayList));
    }
}