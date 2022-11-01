package Logic_Based_Programming;

public class Sum_Odd_number_array {
    public static void SumAllOdd(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1) {

            if (arr[i]%2==1) {
                sum = sum + arr[i];
            }
        }


        System.out.println("Sum Of All Odd Element : "+sum);
    }

    public static void main(String[] args) {

        int[] ints={1,2,3,4,5};
        SumAllOdd(ints);


    }
}
