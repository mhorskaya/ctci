package ctci.ch1;

import java.util.HashMap;

public class Question_1_5 {
    public static boolean isOneAway(String s1, String s2) {
        String small = s1;
        String large = s2;
        if (s1.length() > s2.length()) {
            small = s2;
            large = s1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : large.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int diff = 0;
        for (char c : small.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                if (s1.length() != s2.length() || diff > 0) {
                    return false;
                }
                diff++;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}
