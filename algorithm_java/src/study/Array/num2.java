package study.Array;

import java.util.Scanner;

// 2. 보이는 학생
public class num2 {

    static int solution(int[] arr) {
        int answer = 0;
        int max = 0;

        for (int x : arr) {
            if (x > max) {
                max = x;
                answer++;
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

        System.out.println(solution(arr));
    }
}
