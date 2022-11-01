package Logic_Based_Programming;

public class All_Numbers_Array_Prime {

    public static void ALlPrime(int[] arr){

        String str="";
        for (int i=0;i<arr.length;i=i+1){
            int num=arr[i];
            int count=0;
            for (int j=1;j<=num;j=j+1) {
                if(num%j==0){
                    count=count+1;
                }
            }
            if (count==2){
                str=str+num+" ";
            }
        }
        System.out.println(str);


    }



    public static void main(String[] args) {
int  arr[] = {1, 3, 4, 5, 7};
ALlPrime(arr);

int arr1[]={1, 2, 3, 4, 5, 6, 7};
ALlPrime(arr1);
    }
}
