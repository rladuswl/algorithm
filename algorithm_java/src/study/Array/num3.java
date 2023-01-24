package study.Array;

import java.util.ArrayList;
import java.util.Scanner;

// 3. 가위 바위 보
public class num3 {

    static ArrayList<String> solution(int n, int[] arrA, int[] arrB) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                answer.add("D");
            } else if (arrA[i] == 1 && arrB[i] == 3) {
                answer.add("A");
            } else if (arrA[i] == 2 && arrB[i] == 1) {
                answer.add("A");
            } else if (arrA[i] == 3 && arrB[i] == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        // 다른 방법 :
        // solution 의 return 값이 String 으로 "ABABD" 라면,
        // for (char x : solution(n, arrA, arrB).toCharArray()) 로 받으면 된다.
        for (String x : solution(n, arrA, arrB)) {
            System.out.println(x);
        }
    }
}
