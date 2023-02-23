package study.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// 1. 학급 회장
public class num1 {

    static char solution(int n, String s) {
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // HashMap 메서드
        // System.out.println(map.containsKey('A'));
        // System.out.println(map.size());
        // System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            // System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n, str));
    }
}
