package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_4 {
    @Test
    public void isPalindromePermutationTest() {
        Assert.assertTrue(Question_1_4.isPalindromePermutation("Tact Coa"));
        Assert.assertFalse(Question_1_4.isPalindromePermutation("hakan"));
    }

    @Test
    public void isPalindromePermutation2Test() {
        Assert.assertTrue(Question_1_4.isPalindromePermutation2("Tact Coa"));
        Assert.assertFalse(Question_1_4.isPalindromePermutation2("hakan"));
    }
}
