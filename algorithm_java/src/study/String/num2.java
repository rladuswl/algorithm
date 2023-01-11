package study.String;

import java.util.Scanner;

// 2. 대소문자 변환
public class num2 {
    static String solution(String str) {
        String answer = "";

        /*
        // 방법 1. isLowerCase(), isUpperCase() 방법
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
         */

        // 방법 2. 아스키코드 방법
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) { // 소문자
                answer += (char)(x-32);
            } else {
                answer += (char)(x+32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
