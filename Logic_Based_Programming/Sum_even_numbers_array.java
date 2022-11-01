package Logic_Based_Programming;

public class Sum_even_numbers_array {
    public static void SumAllEven(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1) {

            if (arr[i]%2==0) {
                sum = sum + arr[i];
            }
        }


        System.out.println("Sum Of All Even Element : "+sum);
    }

    public static void main(String[] args) {

        int[] ints={1,2,3,4,5};
        SumAllEven(ints);


    }
}
