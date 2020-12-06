package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_1 {
    @Test
    public void test1() {
        Assert.assertTrue(Question_1_1.isUnique("khan"));
        Assert.assertFalse(Question_1_1.isUnique("hakan"));
    }
}
