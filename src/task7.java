import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scan.nextInt();
        boolean prime=false;
        for (int i = 2; i <num/2 ; i++) {
            if (num%i==0);
            prime=true;
            break;
        }
        if(!prime){
            System.out.println(num+" is a prime number");

        }else{
            System.out.println(num+" is not a prime number");
        }


    }
}




// 7)Write a java program to check whether a given number is prime or not?