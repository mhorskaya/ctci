package ctci.ch1;

public class Question_1_9 {
    public static boolean isRotation(String s1, String s2) {
        return isSubstring(s1, s2 + s2);
    }

    private static boolean isSubstring(String s1, String s2) {
        return s2.contains(s1);
    }
}
