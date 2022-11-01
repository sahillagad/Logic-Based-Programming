package Logic_Based_Programming;

public class Find_Frequency_Odd_Even {
    public static void Find(int[][] arr){


int odd=0;
int even=0;
        for (int i=0;i<arr.length;i=i+1) {

            for (int j = 0; j < arr[i].length; j = j + 1) {

                if(arr[i][j]%2==0){
                   even=even+1;
                }
                else if (arr[i][j]%2==1) {
                    odd=odd+1;
                }

            }

        }

        System.out.println("ODD : "+odd);
        System.out.println("EVEN : "+even);

    }

    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

     Find(arr);

    }
}
