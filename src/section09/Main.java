package section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {
    int startTime;
    int endTime;

    public Time(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Time o) {
        if (this.endTime == o.endTime) {
            return this.startTime - o.startTime;
        } else {
            return this.endTime - o.endTime; // 회의가 빨리 끝나는 것부터 선택해야 최상의 결과가 나온다.
        }
    }
}

public class Main {
    public int solution(ArrayList<Time> list, int n) {
        int count = 0;

        Collections.sort(list);

        int et = 0; // 첫번째 끝나는 시간을 0으로 초기화함

        for (Time time : list) {
            if (time.startTime >= et) { // 회의가 진행된다면
                et = time.endTime;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            list.add(new Time(firstTime, endTime));
        }

        System.out.println(main.solution(list, n));
    }
}
