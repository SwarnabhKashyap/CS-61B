package com;

import java.util.Arrays;

public class AList {

    private int[] a;
    private int len;
    private int arrayResize_count=0;
    /** Creates an empty list. */
    public AList() {
            a = new int[100];
            len = 0;
    }

    //method to resize the array
    public void resize(int capacity)
    {
        int[] a_new = new int[capacity];
        System.arraycopy(a,0,a_new,0,len);
        a = a_new;
    }
    /** Inserts X into the back of the list. */
    //we refactor the new array using a multiplicative constant so as to reduce computation time
    //this may result in inefficient usage of memory
    //to counter that we may downsize the array
    public void addLast(int x) {
        if(len==a.length) {
            resize(len*2);
        }
        a[len] = x;
        len++;

    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return a[len-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return a[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return len;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */

    //downsizing the array if usage ratio is less than 0.25
    public int removeLast() {
        float usage_ratio = (float) len/a.length;
        if(usage_ratio<0.25)
        {
            arrayResize_count++;
            System.out.println("Less Usage Ratio detected,Array Resize count: "+arrayResize_count);
            resize(a.length/2);

        }
        int deleted_item = a[len-1];
        len--;
        return deleted_item;
    }


    //Method to print the elements of the array
    public void ArrayPrint()
    {
        System.out.println("Array Elements are"+ Arrays.toString(a));
    }
}