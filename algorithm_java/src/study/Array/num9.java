package study.Array;

import java.util.Scanner;

// 9. 격자판 최대합
public class num9 {

    static int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2; // sum1 : 행의 합, sum2 : 열의 합

        // 행과 열
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 대각선
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
