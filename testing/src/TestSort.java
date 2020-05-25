public class TestSort {

    public static void testSort()
    {
        String[] input = {"I","have","an","egg"};
        String[] expected = {"an","egg","have","I"};

        Sort.sort(input);
        if(input!=expected)
        {
            System.out.println("Error! There seems to be a problem with Sort.sort!");
        }
        //naive testing method
        for(int i=0;i<input.length;i++)
        {
            if(!input[i].equals(expected[i]))
            {
                System.out.println("Mismatch in position "+i+" ,expected: "+expected[i]+" ,got: "+input[i]);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
            testSort();
    }
}
