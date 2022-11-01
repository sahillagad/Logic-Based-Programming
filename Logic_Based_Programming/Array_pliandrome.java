package Logic_Based_Programming;

public class Array_pliandrome {

    public static void Pliandrome(int[] arr){

        int arr1[]=new int[arr.length];
        int index=0;
        for (int i=arr.length-1;i>=0;i=i-1){
            arr1[index]=arr[i];
             index=index+1;
        }

        boolean b=true;
        for (int k=0;k<arr.length;k=k+1){
            if(arr[k]!=arr1[k]){
                b=false;
               break;
            }
        }

        if (b==false){
            System.out.println("Array not pliandrome");
        }
        else{
            System.out.println("Array is pliandrome");
        }
    }

    public static void main(String[] args) {
        int[] a={3, 6, 0, 6, 3};
        Pliandrome(a);

        int[] a1= {1, 2, 3, 4, 5};
        Pliandrome(a1);

    }
}
