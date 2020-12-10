package ctci.ch1;

public class Question_1_3 {
    public static String urlify(String s, int length) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < length; i++) {
            count += chars[i] == ' ' ? 3 : 1;
        }
        int size = count;
        while (count > 0) {
            if (chars[length - 1] == ' ') {
                chars[count - 1] = '0';
                chars[count - 2] = '2';
                chars[count - 3] = '%';
                count -= 3;
            } else {
                chars[count - 1] = chars[length - 1];
                count--;
            }
            length--;
        }
        return new String(chars, 0, size);
    }
}
