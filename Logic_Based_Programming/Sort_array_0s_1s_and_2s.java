package Logic_Based_Programming;

public class Sort_array_0s_1s_and_2s {

    public static void SortArray(int[] arr) {

        for (int i = 0; i < arr.length; i = i + 1) {

            for (int j = i + 1; j < arr.length; j = j + 1) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String str="";

        for (int k=0;k<arr.length;k=k+1){

            str=str+arr[k]+" ";

        }

        System.out.println(str);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        SortArray(arr);


         int[] arr1={0, 1, 2, 0, 1, 2};
         SortArray(arr1);
    }
}

