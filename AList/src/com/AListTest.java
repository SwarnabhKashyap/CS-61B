package com;

import java.util.Arrays;

public class AListTest {
    public static void main(String[] args)
      {
//        AList l1 = new AList();
//        for(int i=0;i<100000;i++)
//        {
//            l1.addLast(i);
//        }
//        l1.ArrayPrint();

        AList l2 = new AList();
        //adding items to the AList
        for(int i=0;i<300;i++)
        {
            l2.addLast(i);
        }

        //removing items from the AList
        l2.ArrayPrint();
        for(int i=0;i<295;i++)
        {
             System.out.println(l2.removeLast());
        }

        l2.ArrayPrint();
}
}
