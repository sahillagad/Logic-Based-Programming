package Logic_Based_Programming;

public class Second_smallest_element_array {

    public static void SecondElement(int[] arr){


        for (int i=0;i<arr.length;i=i+1){

            for (int j=i+1;j<arr.length;j=j+1){

                if(arr[i]>arr[j]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }






        System.out.println("Maximum Number : "+arr[1]);
    }

    public static void main(String[] args) {
        int[] arr={100,34,56,78};
        SecondElement(arr);
    }
}
