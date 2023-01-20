package study.String;

import java.util.Scanner;

// 7. 회문 문자열
public class num7 {

    static String solution(String str) {
        String answer = "YES";

        // 방법 1
//        str = str.toUpperCase();
//        int len = str.length();
//
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }

        // 방법 2
        String tmp = new StringBuilder(str).reverse().toString();

        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
