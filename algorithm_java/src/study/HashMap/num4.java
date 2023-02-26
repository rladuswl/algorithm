package study.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// 4. 모든 아나그램 찾기
public class num4 {

    static int solution(String S, String T) {
        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : T.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int L = T.length() - 1;
        for (int i = 0; i < L; i++) {
            am.put(S.charAt(i), am.getOrDefault(S.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < S.length(); rt++) {
            am.put(S.charAt(rt), am.getOrDefault(S.charAt(rt), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(S.charAt(lt), am.get(S.charAt(lt)) - 1);
            if (am.get(S.charAt(lt)) == 0) {
                am.remove(S.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        System.out.println(solution(S, T));
    }
}
