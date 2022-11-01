package Logic_Based_Programming;

public class Two_Matrix_equal_Or_not {
    public static boolean AllSum(int[][] arr, int[][] arr1) {

            for (int i = 0; i < arr.length; i = i + 1) {
                 for (int j = 0; j < arr[i].length; j = j + 1) {
                       if (arr[i][j]!=arr1[i][j]){
                                return false;
                        }

                }
            }
            return true;
        }


    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] arr1={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
      boolean b=AllSum(arr,arr1);
        System.out.println(b);

    }
}
