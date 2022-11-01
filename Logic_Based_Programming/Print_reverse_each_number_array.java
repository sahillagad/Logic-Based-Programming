package Logic_Based_Programming;

public class Print_reverse_each_number_array {


    public static void reverse(int[] arr){

        int[] arr1=new int[arr.length];
        for (int i=0;i<arr.length;i=i+1){
           String str=String.valueOf(arr[i]);
           String str1="";
           for (int j=str.length()-1;j>=0;j=j-1){
               str1=str1+str.charAt(j);
            }
           arr1[i]=Integer.parseInt(str1);
        }

        String str2="";
        for (int k=0;k<arr1.length;k=k+1){
            str2=str2+arr1[k]+" ";
        }
        System.out.println(str2);
    }

    public static void main(String[] args) {
       int arr[]={13,456,789,34};
       reverse(arr);

    }
}
