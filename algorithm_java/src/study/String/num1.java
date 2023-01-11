package study.String;

import java.util.Scanner;

// 1. 문자 찾기
public class num1 {
    static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        /*
        // 방법 1
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }
        */

        // 방법 2
        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c));
    }
}
