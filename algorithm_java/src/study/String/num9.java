package study.String;

import java.util.Scanner;

// 9. 숫자만 추출
public class num9 {

    static int solution(String str) {

        // 방법 1
//        int answer = 0;
//
//        str = str.toUpperCase().replaceAll("[A-Z]", "");
//        answer = Integer.parseInt(str);
//
//        return answer;

        // 방법 2. 아스키코드
//        int answer = 0;
//
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }
//
//        return answer;

        // 방법 3. 메서드 사용
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
