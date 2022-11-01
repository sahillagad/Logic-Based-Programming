package Logic_Based_Programming;

import java.util.Scanner;

public class Sum_digits_between_two_numbers {

    public static void SumDigitBetween(int num1,int num2){

        int sum=0;
        for(int i=num1;i<=num2;i=i+1){

          sum=sum+i;
        }

        System.out.println("Sum of digits in numbers from "+ num1 +" to "+num2+" = "+sum);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1=sc.nextInt();

        System.out.println("Enter Number 2");
         int num2=sc.nextInt();

        SumDigitBetween(num1,num2);
    }
}
