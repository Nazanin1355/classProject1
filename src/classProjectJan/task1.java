package classProjectJan;
import java.util.Arrays;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] nums=new int[4];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please enter the "+i+" integer values of the array ");
            nums[i]=scan.nextInt();
            sum+=nums[i];

        }
        System.out.println(Arrays.toString(nums));
        System.out.println("the sum of the values is : "+sum);
    }

    }



//1)Using Scanner create an array of integer values. After the array is created,
// calculate the sum of all stored elements in that array.