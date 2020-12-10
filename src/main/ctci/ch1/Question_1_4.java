package ctci.ch1;

import java.util.HashMap;

public class Question_1_4 {
    public static boolean isPalindromePermutation(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        boolean odd = false;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                if (odd) {
                    return false;
                }
                odd = true;
            }
        }
        return true;
    }

    public static boolean isPalindromePermutation2(String s) {
        int map = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c != ' ') {
                map ^= 1 << c - 'a';
            }
        }
        return map == 0 || (map & map - 1) == 0;
    }
}
