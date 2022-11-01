package Logic_Based_Programming;

public class Subtraction_of_two_matrix {
    public static void AllSum(int[][] arr, int[][] arr1) {

        int[][] arr2=new int[(arr.length)][(arr[0].length)];
        for (int i = 0; i < arr.length; i = i + 1) {
            for (int j = 0; j < arr[i].length; j = j + 1) {

                arr2[i][j]=((arr[i][j])-(arr1[i][j]));
            }
        }




        for (int p = 0; p < arr2.length; p = p + 1) {
            String str="";
            for (int q = 0; q < arr2[p].length; q = q + 1) {

                str=str+arr2[p][q]+" ";
            }
            System.out.println(str);
        }

    }


    public static void main(String[] args) {

        int[][] arr={
                {4,2,3,4},
                {8,9,23,9},
                {9,13,12,14}
        };

        int[][] arr1={
                {1,5,2,3},
                {5,6,7,8},
                {9,10,11,12}
        };
        AllSum(arr,arr1);


    }
}
