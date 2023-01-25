package classProjectJan;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter 2 numbers: ");
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("your numbers are "+a+" and "+b+" before swaping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping the numbers are "+a+" "+b);
    }
}

//6)Write a program to swap 2 numbers without a temporary variable?