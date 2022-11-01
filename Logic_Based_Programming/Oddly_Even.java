package Logic_Based_Programming;

public class Oddly_Even {
    public static void ODD_EVEN(int[] arr){

        for (int i=0;i<arr.length;i=i+1){

            if (arr[i]%2==1){

                System.out.println(arr[i]+" ODD");
            }
            else if (arr[i]%2==0){

                System.out.println( arr[i]+" EVEN");
            }
        }

            }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
       ODD_EVEN(arr);
    }
}
