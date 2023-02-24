package study.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 2. 아나그램
public class num2 {

    static String solution(String str1, String str2) {

        // 방법 1.
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }

        return answer;

        // 방법 2.
        /*
        String answer;

        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        String a = Arrays.toString(strArray1);
        String b = Arrays.toString(strArray2);

        if (a.equals(b)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }
}
