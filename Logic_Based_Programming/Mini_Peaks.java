package Logic_Based_Programming;

public class Mini_Peaks {
    public static void Peeks(int[] arr){

        String str="";
        for (int i=1;i<arr.length-1;i=i+1){

            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){

                str=str+arr[i]+" ";
            }
        }

        System.out.println("Output : "+str);

    }

    public static void main(String[] args) {

 int array[] = {10, 20, 15, 2, 23, 90, 67};
 Peeks(array);

 int arr[]={5, 10, 20, 15};
 Peeks(arr);
    }
}
