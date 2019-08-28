/**
 * YuemengLi
 * COMP 3700 Assignment 2
 * Finder test
 */
import org.junit.Assert;
import org.junit.Test;

public class FinderTest {
    @Test
    public void testFindMax() {
        int[] emptyArray = {};
        int[] nullArray = null;
        int[] testArray = {5, 18, 25, 66, -67, 0, 39};


        Assert.assertNull(Finder.findMax(emptyArray));
        Assert.assertNull(Finder.findMax(nullArray));
        Assert.assertEquals(66, (int) Finder.findMax(testArray));
    }

    @Test
    public void testFindMin() {
        int[] emptyArray = {};
        int[] nullArray = null;
        int[] testArray = {5, 18, 25, 66, -67, 0, 39};


        Assert.assertNull(Finder.findMin(emptyArray));
        Assert.assertNull(Finder.findMin(nullArray));
        Assert.assertEquals(-67, (int) Finder.findMin(testArray));
    }
}