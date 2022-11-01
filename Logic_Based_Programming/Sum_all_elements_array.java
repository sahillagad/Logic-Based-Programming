package Logic_Based_Programming;

public class Sum_all_elements_array {

    public static void SumAll(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1){

            sum=sum+arr[i];
        }

        System.out.println("Sum Of All Element : "+sum);
    }

    public static void main(String[] args) {

        int[] ints={1,2,3,4,5};
        SumAll(ints);


    }
}

