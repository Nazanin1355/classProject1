package classProjectJan;

public class task8 {
    public static void main(String[] args) {
        int number=10;
        int firstTerm=0;
        int secondTerm=1;
        for (int i = 1; i <=number; i++) {
            System.out.print(firstTerm+", ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;

    }
}}
//8)Write a Java Program to print the first 10 numbers of Fibonacci series.