package study.String;

import java.util.Scanner;

// 3. 문장 속 단어
public class num3 {
    static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화

        /*
        // 방법 1. split() 사용
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();

            if (len > m) {
                m = len;
                answer = x;
            }
        }
        */

        // 방법 2. indexOf(), substring() 사용
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > m) {
                m = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);
        }

        if (str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 단어x, 한줄 입력 받기o

        System.out.println(solution(str));
    }
}