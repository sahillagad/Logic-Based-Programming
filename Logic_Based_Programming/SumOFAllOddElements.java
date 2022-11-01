package Logic_Based_Programming;

public class SumOFAllOddElements {
    public static void AllSum(int[][] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1) {
            for (int j = 0; j < arr.length; j = j + 1) {

                if (arr[i][j]%2==1) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum : "+sum);
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
