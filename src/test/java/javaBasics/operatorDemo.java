package javaBasics;

public class operatorDemo {

    public static void main(String[] args) {

        //1) Arithmetic operators   + - * / %

        int a =10 , b= 20 ;
        /*System.out.println("Sum of a and b:"+ (a+b));  // concatining in java   // string + operators
        System.out.println("Diff of a and b:"+(a-b));
        System.out.println("Multiplication of a and b:"+(a*b));
        System.out.println("Division of a and b :"+(a/b));
        System.out.println("module of a and b:"+(a%b));*/

        //Relational/comparison operators  >  >=  <  <=  !=  ==
        // Test cae validation we can use the Relational operators
      /*  System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a==b);*/

        // 3) Logical operators   &&   ||  !

        // Boolean operator   True ,False
        // && - both values should be true then only true
        boolean x = false ;
        boolean y = false;

        //System.out.println(x&&y);
       // System.out.println(x||y);
        System.out.println(!y);

       // Assignment Task in Java //

       // 4) Increment & Decrement operators  ++  --  //  ++ increasing one  int a =10
          //float a =10.34;
           a=a+1;
           // Two different ways we can declare the increment in java
        // a ++ ; // post increment
        // ++ a; // pre increment

        // Scenarios
          int res = a ++ ; // post increment
          int res1 = ++ a; //pre increment
          System.out.println(res1);

//          int b =10;
          b=b-1;
           b --; // post decrement
          -- b ;// pre decrement

//          int res = b --;
//          int res1 = -- b;
        System.out.println( res);


        //  5) Assignment   =   +=   -=   *= /=  %=
         // shorthand operators   +=   -=   *= /=  %=
       // increment more value we can use += operaros

//        int a =10;
//        a =a+10;
//        a+=10; // using += assignment operator
//        System.out.println(a);

        // decrement more values we can use -= operator
/*
        int c =100;
       // c = c-50; // normal function
        c-=50; // Java based function 
        System.out.println("Dcrement the more value scenario:"+c);
*/

        // *= /= %=

//        x = x*2 ;
//        x*=2; // varibale we are using
//        x= x/2;
//        x/=2; //
//        x=x%2;
//        x%=2;

    }
}
