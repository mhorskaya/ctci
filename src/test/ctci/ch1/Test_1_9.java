package ctci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Test_1_9 {
    @Test
    public void rotateMatrixTest() {
        Assert.assertTrue(Question_1_9.isRotation("waterbottle", "erbottlewat"));
        Assert.assertFalse(Question_1_9.isRotation("waterbottle", "erbottlewas"));
    }
}
