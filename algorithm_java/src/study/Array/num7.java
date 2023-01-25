package study.Array;

import java.util.Scanner;

// 7. 점수계산
public class num7 {

    static int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                score++;
                answer += score;
            } else {
                score = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
