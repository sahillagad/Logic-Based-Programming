package Logic_Based_Programming;

public class Increment_every_element_array_one_unit {

    public static void Increment(int[] arr){
        int[] arr1=new int[(arr.length)];
        for (int i=0;i<arr1.length;i=i+1) {

             arr1[i]=(arr[i]+1);

        }
        String str="";
        for(int k=0;k<arr1.length;k=k+1){
            str=str+arr1[k]+" ";
        }
        System.out.println(str);


    }

    public static void main(String[] args) {

        int[] arr={2, 3, 4, 5, 6, 7, 8, 9, 10};
        Increment(arr);

    }
}

