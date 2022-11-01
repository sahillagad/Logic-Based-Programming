package Logic_Based_Programming;

public class Column_Wise_Sum_in_matrix_elements {

    public static void AllSum(int[][] arr){


        for (int i=0;i<arr[0].length;i=i+1) {
            int sum=0;
            for (int j = 0; j < arr.length; j = j + 1) {


                sum = sum + arr[j][i];

            }
            System.out.println("Sum of Column "+(i+1)+" : "+sum);
        }

    }

    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        AllSum(arr);
    }
}
