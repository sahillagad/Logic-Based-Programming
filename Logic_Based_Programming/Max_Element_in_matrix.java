package Logic_Based_Programming;

public class Max_Element_in_matrix {
    public static void AllSum(int[][] arr){

        int notepad=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i=i+1) {

            for (int j = 0; j < arr[i].length; j = j + 1) {

            if(arr[i][j]>=notepad){
                notepad=arr[i][j];
            }

            }

        }

        System.out.println("Max_Element_in_matrix : "+notepad);
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
