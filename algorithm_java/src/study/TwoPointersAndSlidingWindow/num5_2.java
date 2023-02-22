package study.TwoPointersAndSlidingWindow;

import java.util.Scanner;

// 5-2. 연속된 자연수의 합 (수학)
public class num5_2 {

    static int solution(int n) {
        int answer = 0;
        int cnt = 1;

        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
