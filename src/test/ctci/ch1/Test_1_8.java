package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_8 {
    @Test
    public void zeroMatrixTest() {
        int[][] matrix = new int[][]{
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 0, 1},
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1},
                new int[]{0, 1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1}
        };
        int[][] output = new int[][]{
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 0, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 0, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1}
        };
        Assert.assertArrayEquals(Question_1_8.zeroMatrix(matrix), output);
    }

    @Test
    public void zeroMatrix2Test() {
        int[][] matrix = new int[][]{
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 0, 1},
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1},
                new int[]{0, 1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1}
        };
        int[][] output = new int[][]{
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 0, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 0, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1}
        };
        Assert.assertArrayEquals(Question_1_8.zeroMatrix2(matrix), output);
    }
}
