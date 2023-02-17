package study.TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

// Two pointers, Sliding window [효율성 : O(n^2) -> O(n)]
// 1. 두 배열 합치기 (two pointers algorithm)
public class num1 {

    static ArrayList<Integer> solution(int n, int[] arrN, int m, int[] arrM) {
        ArrayList<Integer> answer = new ArrayList<>();

        int pn = 0, pm = 0;

        while (pn < n && pm < m) {
            if (arrN[pn] <= arrM[pm]) {
                answer.add(arrN[pn]);
                pn++;
            } else {
                answer.add(arrM[pm]);
                pm++;
            }
        }

        while (pn < n) {
            answer.add(arrN[pn]);
            pn++;
        }

        while (pm < m) {
            answer.add(arrM[pm]);
            pm++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }

        for (int x : solution(n, arrN, m, arrM)) {
            System.out.print(x + " ");
        }
    }
}
