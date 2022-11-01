package Logic_Based_Programming;

public class Number_even_and_odd_elements {

    public static void CountCheck(int[] arr){

        int even=0;
        int odd=0;
        for (int i=0;i<arr.length;i=i+1){

            if(arr[i]%2==0){
                System.out.println(arr[i]);
                even=even+1;
            }
            if (arr[i]%2==1){
//                System.out.println(arr[i]);
                odd=odd+1;
            }

        }

        System.out.println("Number Of Odd : "+odd);
        System.out.println("Number of even : "+even);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        CountCheck(arr);

    }
}
