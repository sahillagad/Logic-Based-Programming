package Logic_Based_Programming;

public class Sum_two_arrays {

    public static void SumTwoArray(int[] arr1,int[] arr2){

        String str1="";
        for (int i=0;i<arr1.length;i=i+1){
            str1=str1+arr1[i];
        }

        String str2="";
        for (int j=0;j<arr2.length;j=j+1){
            str2=str2+arr2[j];
        }

        int i=Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println("Output : "+i);
        System.out.println("----------------------");
    }


    public static void main(String[] args) {


        int[] arr1={ 9, 5, 4, 9 };
        int[] arr2= { 2, 1, 4 };
        SumTwoArray(arr1,arr2);

        int[] arr3={ 1, 2, 3 };
        int[] arr4= { 2, 1, 4 };
        SumTwoArray(arr3,arr4);
    }

}
