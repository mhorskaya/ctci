package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_6 {
    @Test
    public void compressStringTest() {
        Assert.assertEquals(Question_1_6.compressString("aabcccccaaa"), "a2b1c5a3");
        Assert.assertEquals(Question_1_6.compressString("aabbcc"), "aabbcc");
        Assert.assertEquals(Question_1_6.compressString("abc"), "abc");
    }
}
