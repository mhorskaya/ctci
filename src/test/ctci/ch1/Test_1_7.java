package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_7 {
    @Test
    public void rotateMatrixTest() {
        int[] matrix3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotate3 = new int[]{7, 4, 1, 8, 5, 2, 9, 6, 3};
        Assert.assertArrayEquals(Question_1_7.rotateMatrix(matrix3), rotate3);

        int[] matrix4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] rotate4 = new int[]{13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3, 16, 12, 8, 4};
        Assert.assertArrayEquals(Question_1_7.rotateMatrix(matrix4), rotate4);
    }

    @Test
    public void rotateMatrix2Test() {
        int[] matrix3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotate3 = new int[]{7, 4, 1, 8, 5, 2, 9, 6, 3};
        Assert.assertArrayEquals(Question_1_7.rotateMatrix2(matrix3), rotate3);

        int[] matrix4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] rotate4 = new int[]{13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3, 16, 12, 8, 4};
        Assert.assertArrayEquals(Question_1_7.rotateMatrix2(matrix4), rotate4);
    }
}
