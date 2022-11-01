package Logic_Based_Programming;

public class Find_Number_Misses {

    public static int FindMissNumber(int[] arr){

        int n=(arr.length+1);
        int sum=((n*(n+1))/2);

        int arrsum=0;
        for(int i=0;i<arr.length;i=i+1){

            arrsum=arrsum+(arr[i]);

        }


 return (sum-arrsum);
    }

    public static void main(String[] args) {


        int arr[] = { 1, 3, 7, 5, 6, 2};
     int x= FindMissNumber(arr);

        System.out.println("Missing Integer : "+x);
    }
}
