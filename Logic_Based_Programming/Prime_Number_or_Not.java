package Logic_Based_Programming;

import java.util.Scanner;

public class Prime_Number_or_Not {

    public static void PrimeOrNot(int num){

        int count=0;
        for (int i=1;i<num;i=i+1){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println(num+" Is Prime Number");
        }
        else{
            System.out.println(num+" Is Not Prime Number");
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int n=sc.nextInt();
        PrimeOrNot(n);

    }
}
