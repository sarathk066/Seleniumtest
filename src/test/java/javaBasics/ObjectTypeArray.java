package javaBasics;

public class ObjectTypeArray {
    public static void main(String[] args) {
        // Object Array will store any data type in array
        // length of the array i alreay knows
        Object a[] = new Object[5];
        a[0]= 10;
        a[1]=10.5;
        a[2]="Welcome";
        a[3]='A';
        a[4]=true;

        // for loop will work based on condition
        // before using the for loop you need to know the coding
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }

    }
}
