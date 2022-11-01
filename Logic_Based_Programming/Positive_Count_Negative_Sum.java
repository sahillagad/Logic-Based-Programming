package Logic_Based_Programming;

public class Positive_Count_Negative_Sum {

    public static void CountNumber(int[] arr){

         int positive=0;
         int negative=0;
         int zero=0;

         for (int i=0;i<arr.length;i=i+1){

             if(arr[i]>0){
                 positive=positive+1;
             }
             if(arr[i]<0){
                 negative=negative+1;
             }
             else if(arr[i]==0){
                 zero=zero+1;
             }
         }


        System.out.println("Total Positive Number: " +positive);
        System.out.println("Total Negative Number: " +negative);
        System.out.println("Total Zero: " +zero);
    }

    public static void main(String[] args) {

 int[] arr={32,43,0,-43,-56,-65,23,0,53,13};
 CountNumber(arr);

    }
}
