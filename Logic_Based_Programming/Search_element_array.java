package Logic_Based_Programming;

public class Search_element_array {

    public static String SearchElement(int[] arr,int num){


        for (int i=0;i<arr.length;i=i+1){

            if(arr[i]==num){

                return "Yes";
            }

        }

        return "No";

    }

    public static void main(String[] args) {

        int[]  arr={1,2,3,4,5};
       String s=SearchElement(arr,4);
        System.out.println(s);

    }

}
