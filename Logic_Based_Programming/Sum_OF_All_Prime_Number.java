package Logic_Based_Programming;

public class Sum_OF_All_Prime_Number {
    public static void AllSum(int[][] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1) {
            for (int j = 0; j < arr[i].length; j = j + 1) {

                int count=0;
                for (int k=1;k<=arr[i][j];k=k+1){
                    if(arr[i][j]%k==0){
                        count=count+1;
                    }

                }
                if(count==2){
//                    System.out.println(arr[i][j]);
                    sum=sum+arr[i][j];
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
