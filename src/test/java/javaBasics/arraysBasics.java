package javaBasics;

import java.util.Arrays;

public class arraysBasics {
    /*1. Declare an array
    2. Insert values into array
     3. Find Size of an array
    4. read single valule from an array
    5. read multiple values from an array */

    public static void main(String[] args) {
        // Declaration of an array
        int a[] = new int[5] ;
        a[0] =100;
        a[1]=200;
        a[2]= 300;
        a[3]= 400;
        a[4]=500;
        // Approach 2
        int b[]= {100,200,300,400,500};
        // Size of length array  // Interview Question what is keyword you can use in array to find the length
       // System.out.println(b.length);
        //read single valule from an array
        // Index 5 out of bounds for length 5
        //System.out.println(b[2]);
        //read multiple values from an array
        System.out.println(Arrays.toString(b));

        // Assignment like try with multiple array
        int c[][]= new int[3][2];






    }
}
