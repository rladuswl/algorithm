package study.String;

import java.util.Scanner;

// 10. 가장 짧은 문자거리
public class num10 {

    static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        // c를 기준으로 왼쪽에서 떨어진 거리
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p ++;
                answer[i] = p;
            }
        }

        // c를 기준으로 오른쪽에서 떨어진 거리 계산 후 작은 값으로 변경
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p ++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
