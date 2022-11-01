package Logic_Based_Programming;

import java.util.Scanner;

public class Sum_of_even_numbers {

    public static void sumEven(int[] arr){

        int sum=0;

        for (int i=0;i< arr.length;i=i+1){


            if(arr[i]%2==0){

                sum=sum+arr[i];
            }
        }

        System.out.println("Sum of Even Number :- "+sum);


    }


    public static void main(String[] args) {

      int arr[] ={1,2,3,4,5,6,7,8,9,10};
      sumEven(arr);



    }
}
