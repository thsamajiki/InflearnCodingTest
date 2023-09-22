package section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));
        }

        while (!q.isEmpty()) {
            Person temp = q.poll();

            for (Person x : q) {
                if (x.priority > temp.priority) {
                    q.offer(temp); // temp보다 위험도가 높은 환자가 있으면 temp를 q의 뒤로 보낸다.
                    temp = null;
                    break;
                }
            }

            if (temp != null) {
                answer++;
                if (temp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(n, m, arr));
    }
}