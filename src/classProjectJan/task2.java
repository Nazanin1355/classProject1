package classProjectJan;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
           String[]countries=new String[5];
           for (int i = 0; i < countries.length; i++) {
               System.out.println("Please enter a country name :");
               countries[i]=scan.next();
              System.out.println("Please enter the capital of the country :");
               String capital=scan.next();
               System.out.println("the capital of "+countries[i]+ " is "+capital);
          }

    }


        }



//Using Scanner create an array of countries. When an array is created, retrieve all values from it and while retrieving
// those values print capital for each country. (use 2 different loops).