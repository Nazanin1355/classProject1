package classProjectJan;

public class task3 {
    public static void main(String[] args) {
        int [][] numbers={{1,2,3,},{4,5,6}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++){
        for (int j = 0; j < numbers[i].length; j++) {

sum+=numbers[i][j];


        }

        }
        System.out.println(sum);

    }
}

// Create a 2D array of integer values. Print the sum of all numbers.