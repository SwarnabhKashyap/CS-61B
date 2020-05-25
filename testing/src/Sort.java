public class Sort {

    //method that sorts the Strings in place.
    public static void sort(String[] s)
    {
        sort(s,0);
    }

    //helper method for the above sort method(we use this to hide implementation details as much as possible from user)

    public static void sort(String[] s,int start){

        //Find the smallest item
        // move the smallest item to the front
        // Selection sort the rest (n-1) items,without touching the front item.
        if(start == s.length)
            return;
        int smallest = findSmallest(s,start);
        swap(s,start,smallest);
        sort(s,start+1);
    }

    //returns the smallest string in an array of strings
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    //method to swap the element with the smallest index with the front element.
    public static void swap(String[] x,int a,int b)
    {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
