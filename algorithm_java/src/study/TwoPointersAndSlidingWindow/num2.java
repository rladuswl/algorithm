package study.TwoPointersAndSlidingWindow;

import java.util.*;

// 2. 공통원소 구하기
public class num2 {
    static ArrayList<Integer> solution(int A, int B, int[] arrA, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int pA  = 0, pB = 0;
        while (pA < A && pB < B) {
            if (arrA[pA] == arrB[pB]) {
                answer.add(arrA[pA]);
                pA++;
                pB++;
            } else if (arrA[pA] < arrB[pB]) {
                pA++;
            } else {
                pB++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int[] arrA = new int[A];
        for (int i = 0; i < A; i++) {
            arrA[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        int[] arrB = new int[B];
        for (int i = 0; i < B; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int x : solution(A, B, arrA, arrB)) {
            System.out.print(x + " ");
        }
    }
}
