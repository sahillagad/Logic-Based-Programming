package Logic_Based_Programming;

public class Third_Largest_Second_smallest {

    public static void Element(int[] arr){

        for (int i=0;i<arr.length;i=i+1){
           for (int j=i+1;j<arr.length;j=j+1) {

               if (arr[i] < arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
               }

           }
        }


        System.out.println("Second_smallest : "+arr[1]);
        System.out.println("Third_Largest : "+arr[2]);


    }

    public static void main(String[] args) {

 int[] arr={12, 13, 1, 10, 34, 1};
    Element(arr);
    }
}
