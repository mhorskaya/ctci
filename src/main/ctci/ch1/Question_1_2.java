package ctci.ch1;

import java.util.HashMap;

public class Question_1_2 {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        sortChars(chars1);
        sortChars(chars2);

        for (int i = 0; i < s1.length(); i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }

        return true;
    }

    private static void sortChars(char[] chars) {
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
    }

    public static boolean isPermutation2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
