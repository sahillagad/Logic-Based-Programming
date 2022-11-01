package Logic_Based_Programming;

public class Sum_strong_numbers_array {

    public static void SumStrong(int[] arr){


        for (int i=0;i<arr.length;i=i+1){
            String str=Integer.toString(arr[i]);
            int sum=0;
            for (int j=0;j<str.length();j=j+1) {
              int num=Integer.parseInt(String.valueOf(str.charAt(j)));
                int pro=1;
                for (int k=1;k<=num;k=k+1) {

                    pro=pro*k;
                }
                sum=sum+pro;

                if (sum==arr[i]){
                    System.out.println(arr[i]+" Strong Number");
                }
            }
        }
    }

    public static void main(String[] args) {


        int arr[]={145,534,40585};
        SumStrong(arr);

    }
}
