package Logic_Based_Programming;

public class Array_reverse {

   public static void Reverse(int[] arr1){
        String str="";
        for(int k=arr1.length-1;k>=0;k=k-1){
            str=str+arr1[k]+" ";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int[] arr={2, 3, 4, 5, 6, 7, 8, 9, 10};
        Reverse(arr);
    }
}
