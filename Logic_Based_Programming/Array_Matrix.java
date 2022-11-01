package Logic_Based_Programming;

public class Array_Matrix {

    public static void ArrayMatrix(int[][] arr){

        for (int i=0;i<arr.length;i=i+1){
            for (int j=0;j<arr[i].length;j=j+1){

                System.out.println(arr[i][j]);
            }
        }


    }

    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        ArrayMatrix(arr);
    }
}
