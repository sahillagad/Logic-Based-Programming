package Logic_Based_Programming;

public class Reading_writing_array {

    public static void ReadingArray(int arr[]){

        for (int i=0;i<arr.length;i=i+1){

            System.out.println(arr[i]);

        }

    }

    public static void main(String[] args) {

        int[] ints={1,2,3,4,5};


        ReadingArray(ints);


    }
}
