package Logic_Based_Programming;

public class Retrieve_Last_N_Elements {
    public static void LastElement(int[] arr,int N){

        int index=1;
        String str="";
        int start=((arr.length)-N);
        for (int i=start;i<arr.length;i=i+1){

            str=str+arr[i]+" ";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int[] arr={4, 5, 2, 6, 7, 8, 10};
        LastElement(arr,5);


    }

}
