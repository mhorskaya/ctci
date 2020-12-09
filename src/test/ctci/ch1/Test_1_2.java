package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_2 {
    @Test
    public void isPermutationTest() {
        Assert.assertTrue(Question_1_2.isPermutation("hello", "ohell"));
        Assert.assertFalse(Question_1_2.isPermutation("hakan", "hasan"));
        Assert.assertFalse(Question_1_2.isPermutation("hello", "hell"));
        Assert.assertFalse(Question_1_2.isPermutation("hell", "hello"));
    }

    @Test
    public void isPermutation2Test() {
        Assert.assertTrue(Question_1_2.isPermutation2("hello", "ohell"));
        Assert.assertFalse(Question_1_2.isPermutation2("hakan", "hasan"));
        Assert.assertFalse(Question_1_2.isPermutation("hello", "hell"));
        Assert.assertFalse(Question_1_2.isPermutation("hell", "hello"));
    }
}
