package ctci.ch1;

public class Question_1_6 {
    public static String compressString(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);
        String result = sb.toString();
        return result.length() < s.length() ? result : s;
    }
}
