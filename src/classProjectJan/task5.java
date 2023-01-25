package classProjectJan;

public class task5 {
    public static void main(String[] args) {
        int[][] nums={{1,2,3,4,5},{9,8,7,6}
        };
        int evenSum=0;int oddSum=0;

       for (int[] num:nums){
           for (int row: num){
               if (row % 2 == 0) {
                   evenSum += row;
               } else {
                   oddSum += row;
               }
           }
       }
        System.out.println("The sum of even numbers is " + evenSum);
        System.out.println("The sum of odd numbers is " + oddSum);





    }

        }





//Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd
// numbers for that array.