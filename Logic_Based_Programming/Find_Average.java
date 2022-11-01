package Logic_Based_Programming;

public class Find_Average {

    public static void Average(int[] arr){

        int sum=0;
        for(int i=0;i<arr.length;i=i+1){
            sum=sum+arr[i];
        }

        System.out.println("Average : "+sum/arr.length);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Average(arr);

    }
}
