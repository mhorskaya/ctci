package ctci.ch1;

import java.util.HashSet;

public class Question_1_1 {
    public static boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUnique2(String str) {
        int map = 0;
        for (char c : str.toCharArray()) {
            int bit = 1 << c - 'a';
            if ((map & bit) > 0) {
                return false;
            }
            map |= bit;
        }
        return true;
    }
}
