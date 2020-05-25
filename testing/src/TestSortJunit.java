import org.junit.*;

import java.util.Arrays;

public class TestSortJunit  {
    @Test
    public  void testSortJunit() {
        /*Test the Sort.sort method */
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        //to check whether the expected and sorted results are same.(The Test)
        Assert.assertArrayEquals(expected, input);
    }
    @Test
    public  void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 2;

        int actual2 = Sort.findSmallest(input2, 2);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    /* Test the Sort.swap method */
    @Test
    public  void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an","have","i","egg"};
        int a = 0;
        int b = 2;

        Sort.swap(input,0,2);
        Assert.assertArrayEquals(expected,input);

        String[] input2 = {"She", "works"," two", "jobs", "to", "make", "ends", "meet"};
        String[] expected2 = {"ends", "works"," two", "jobs", "to", "make", "She", "meet"};
        int a2=0;
        int b2=6;
        Sort.swap(input2,a2,b2);
        Assert.assertArrayEquals(expected2,input2);
    }


}
