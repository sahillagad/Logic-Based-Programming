package Logic_Based_Programming;

import java.util.Scanner;

public class Perfect_Number {
    // sum  factor / sum of divisor


    public static void CheckPerfectNumber(int num){

        int sum=0;

        for (int i=1;i<num;i=i+1){
            if(num%i==0) {
                sum = sum + i;

            }
        }
        if(sum==num){
            System.out.println(num+" perfect number ");

        }
        else{
            System.out.println(num+" not perfect number ");
        }

    }


    public static void main(String[] args) {

        System.out.println("Enter Number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        CheckPerfectNumber(num);



    }
}
