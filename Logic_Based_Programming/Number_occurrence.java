package Logic_Based_Programming;

import java.util.Scanner;

public class Number_occurrence {

    public  static void NumberOccurrenceCheck(int num){

        int[] arr={1, 1, 2, 2, 2, 2, 3,};

        int count=0;
        for (int i=0;i<arr.length;i=i+1){

            if(arr[i]==num){

                count=count+1;
            }

        }

        System.out.println( count+" of times "+num +" occurs in arr");

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        NumberOccurrenceCheck(n);



    }
}
