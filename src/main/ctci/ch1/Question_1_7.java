package ctci.ch1;

public class Question_1_7 {
    public static int[] rotateMatrix(int[] matrix) {
        int n = getSize(matrix);
        int[] result = new int[matrix.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j * n + n - i - 1] = matrix[i * n + j];
            }
        }
        return result;
    }

    public static int[] rotateMatrix2(int[] matrix) {
        int n = getSize(matrix);
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int p1 = i * n + j;
                int p2 = (n - j - 1) * n + i;
                int p3 = (n - i - 1) * n + n - j - 1;
                int p4 = j * n + n - i - 1;
                int temp = matrix[p1];
                matrix[p1] = matrix[p2];
                matrix[p2] = matrix[p3];
                matrix[p3] = matrix[p4];
                matrix[p4] = temp;
            }
        }
        return matrix;
    }

    private static int getSize(int[] matrix) {
        return (int) Math.sqrt(matrix.length);
    }
}
