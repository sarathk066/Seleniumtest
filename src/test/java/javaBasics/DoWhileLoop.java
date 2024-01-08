package javaBasics;

public class DoWhileLoop {


    public static void main(String[] args) {
        // 1 ................10
        // Do while will work as first allow the statment and check the conidtion

        int i=1 ;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);

        // do while using decrement operator
        int J =10;
        do {
            System.out.println(i);
            J -- ;
        } while (J>=1);
    }
}
