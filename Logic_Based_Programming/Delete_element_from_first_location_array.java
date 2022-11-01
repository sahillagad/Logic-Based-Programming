package Logic_Based_Programming;

public class Delete_element_from_first_location_array {

    public static void DeleteFirstPosition(int[] arr){


        int[] arr1=new int[(arr.length-1)];
        for (int i=1;i<arr.length;i=i+1) {

            arr1[i-1]=arr[i];

        }

        String str="";
        for(int k=0;k<arr1.length;k=k+1){
            str=str+arr1[k]+" ";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int[] arr={2, 3, 4, 5, 6, 7, 8, 9, 10};
        DeleteFirstPosition(arr);


    }
}
