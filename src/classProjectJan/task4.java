package classProjectJan;

public class task4 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4, 5, 6,}, {9, 8, 7}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] % 2 == 0) {


                    System.out.println(nums[i][j]);
                }
            }
        }
    }

}




// Create a 2D array or integer type where you will store odd and even numbers. Develop a
// program which will identify/print the even numbers only.