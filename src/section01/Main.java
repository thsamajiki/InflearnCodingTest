package section01;

import java.io.*;

public class Main {
    public String solution(String str) {
        int maxLength = 0;
        String maxWord = "";

        int position;

        // indexOf를 통해 찾은 공백 문자의 인덱스를 position 변수에 저장
        while((position = str.indexOf(' ')) != -1) {    // indexOf를 통해 해당 문자를 찾지 못하면 -1이 리턴됨
            String temp = str.substring(0, position);
            int length = temp.length();

            if (maxLength < length) {
                maxLength = length;
                maxWord = temp;
            }

            str = str.substring(position + 1); // 인자를 position 으로 하면 공백문자가 되어서 무한 루프가 됨
        }

        if (maxLength < str.length()) {
            maxWord = str;
        }

        return maxWord;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}