package study.String;

import java.util.Scanner;

// 9. 숫자만 추출
public class num9 {

    static int solution(String str) {
        int answer = 0;

        // 방법 1
        // str = str.toUpperCase().replaceAll("[A-Z]", "");
        // answer = Integer.parseInt(str);

        // 방법 2. 아스키코드
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
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
