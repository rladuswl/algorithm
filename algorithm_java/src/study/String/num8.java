package study.String;

import java.util.Scanner;

// 8. 팰린드롬 (replaceAll 정규식 이용)
public class num8 {

    static String solution(String str) {
        String answer = "NO";

        // 정규식 쓰기 위해 replaceAll 사용
        // ^ 는 부정을 의미
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();

        // equalsIgnoreCase() 는 대소문자 무시하고 같은지 확인
        // 위에서 toUpperCase() 로 이미 대문자 변환을 했기에 equals 로 비교
        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 띄어쓰기 있기 때문에 한 줄을 읽기

        System.out.println(solution(str));
    }
}
