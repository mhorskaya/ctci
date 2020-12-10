package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_3 {
    @Test
    public void urlifyTest() {
        Assert.assertEquals(Question_1_3.urlify("Mr John Smith    ", 13), "Mr%20John%20Smith");
        Assert.assertEquals(Question_1_3.urlify("Mr and Mrs Smith      ", 16), "Mr%20and%20Mrs%20Smith");
        Assert.assertEquals(Question_1_3.urlify(" Mr  ", 3), "%20Mr");
        Assert.assertEquals(Question_1_3.urlify(" Mr   ", 3), "%20Mr");
    }
}
