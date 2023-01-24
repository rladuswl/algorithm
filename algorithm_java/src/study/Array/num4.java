package study.Array;

import java.util.Scanner;

// 4. 피보나치 수열
public class num4 {

    static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }
}
