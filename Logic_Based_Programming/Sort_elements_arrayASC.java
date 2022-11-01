package Logic_Based_Programming;

public class Sort_elements_arrayASC {

    public static void SortAsc(int[] arr){

        for (int i=0;i<arr.length;i=i+1){

            for (int j=i+1;j<arr.length;j=j+1) {

                if(arr[i]>arr[j]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }

        String str="";
        for (int k=0;k<arr.length;k=k+1){
            str=str+arr[k]+" ";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {


        int[] arr={ -5, -9, 8, 12, 1, 3 };
        SortAsc(arr);
    }
}
