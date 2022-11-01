package Logic_Based_Programming;

public class Diff_between_largest_smallest_element_array {
    public  static void diff(int[] arr){

        int notepad=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i=i+1){

            if (arr[i]>=notepad){
                notepad=arr[i];
            }

        }

        int notepad1=Integer.MAX_VALUE;
        for (int j=0;j<arr.length;j=j+1){

            if (arr[j]<=notepad1){
                notepad1=arr[j];
            }
        }

        System.out.println("Different between largest and smallest element in array "+(notepad-notepad1));

    }

    public static void main(String[] args) {

        int[] arr={12,34,56,78};
        diff(arr);

    }
}
