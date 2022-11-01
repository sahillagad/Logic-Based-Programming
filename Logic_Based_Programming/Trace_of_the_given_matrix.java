package Logic_Based_Programming;

public class Trace_of_the_given_matrix {
    public static boolean AllSum(int[][] arr,int notepad){



        for (int i=0;i<arr.length;i=i+1) {

            for (int j = 0; j < arr[i].length; j = j + 1) {

                if(arr[i][j]==notepad){
                    return true;
                }

            }

        }
 return false;

    }

    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        boolean b=AllSum(arr,13);
        System.out.println("Output : "+b);
    }
}