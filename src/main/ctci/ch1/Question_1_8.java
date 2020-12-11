package ctci.ch1;

import java.util.Arrays;
import java.util.HashSet;

public class Question_1_8 {
    public static int[][] zeroMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int row : rows) {
            Arrays.fill(matrix[row], 0);
        }
        for (int col : cols) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = 0;
            }
        }
        return matrix;
    }

    public static int[][] zeroMatrix2(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        boolean zeroFirstRow = false;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                zeroFirstRow = true;
                break;
            }
        }
        boolean zeroFirstCol = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroFirstCol = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (zeroFirstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (zeroFirstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }
}
