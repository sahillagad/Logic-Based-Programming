package Logic_Based_Programming;

public class Return_Sum_Two_Smallest_Numbers {

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
        System.out.println("The smallest element is  : "+arr[0]);
        System.out.println("second Smallest element is : "+arr[1]);
        System.out.println("Sum : "+(arr[0]+arr[1]));
    }

    public static void main(String[] args) {
        int[] arr={100,34,56,78};
        SecondElement(arr);
    }
}
