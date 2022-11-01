package Logic_Based_Programming;

public class Min_element_array {
    public static void MaxChack(int[] arr){


        int notepad=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i=i+1){

            if (arr[i]<=notepad){
                notepad=arr[i];
            }

        }

        System.out.println("Minimum Number : "+notepad);
    }

    public static void main(String[] args) {

        int[] arr={12,34,56,78};
        MaxChack(arr);

    }
}
