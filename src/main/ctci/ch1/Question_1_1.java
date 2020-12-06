package ctci.ch1;

import java.util.HashSet;

public class Question_1_1 {
    public static boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            set.add(c);
        }
        return set.size() == str.length();
    }
}
