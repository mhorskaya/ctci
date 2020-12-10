package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_5 {
    @Test
    public void isOneAwayTest() {
        Assert.assertTrue(Question_1_5.isOneAway("pale", "pale"));
        Assert.assertTrue(Question_1_5.isOneAway("ple", "pale"));
        Assert.assertTrue(Question_1_5.isOneAway("pales", "pale"));
        Assert.assertTrue(Question_1_5.isOneAway("pale", "bale"));
        Assert.assertFalse(Question_1_5.isOneAway("pale", "bake"));
        Assert.assertFalse(Question_1_5.isOneAway("gareth", "bale"));
    }
}
