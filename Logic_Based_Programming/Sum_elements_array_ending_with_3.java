package Logic_Based_Programming;

public class Sum_elements_array_ending_with_3 {

    public  static  void SumAll(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1){
            String str=String.valueOf(arr[i]);
            if(Integer.parseInt(String.valueOf(str.charAt((str.length()-1))))==3){
                sum=sum+arr[i];
//                System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
        }

    public static void main(String[] args) {


        int[] arr={1,2,3,33,564,673};
        SumAll(arr);
    }
}
