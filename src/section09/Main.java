package section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {
    int time;
    char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }


    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state; // 시간을 오름차순으로 정렬한 후에 가는 사람을 먼저 처리해야 한다.
        else return this.time - o.time;
    }
}

public class Main {
    public int solution(ArrayList<Time> list) {
        int answer = 0;

        Collections.sort(list);

        int count = 0;

        for (Time time : list) {
            if (time.state == 's') {
                count++;
            } else {
                count--;
            }

            answer = Math.max(answer, count);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            list.add(new Time(startTime, 's'));
            list.add(new Time(endTime, 'e'));
        }

        System.out.println(main.solution(list));
    }
}