package study.String;

import java.util.ArrayList;
import java.util.Scanner;

// 4. 단어 뒤집기
public class num4 {
    static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        /*
        // 방법 1. StringBuilder()
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        */

        // 방법 2. 직접 뒤집기
        for (String x : str) {
            char[] c = x.toCharArray();

            int lt = 0, rt = x.length() - 1;

            while (lt < rt) {
                char tmp = c[lt];

                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }

            String s = String.valueOf(c);
            answer.add(s);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : solution(str)) {
            System.out.println(x);
        }
    }
}