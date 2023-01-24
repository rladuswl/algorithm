package study.Array;

import java.util.Scanner;

// 5. 소수 (에라토스테네스 체)
public class num5 {

    static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1]; // check 배열

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j]++;
                }
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
