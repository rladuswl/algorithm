package study.String;

import java.util.Scanner;

// 5. 특정 문자 뒤집기
public class num5 {
    static String solution(String str) {
        String answer;

        char[] charArray = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;

                lt++;
                rt--;
            }
        }

        answer = String.valueOf(charArray);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}