package Logic_Based_Programming;

import java.util.Scanner;

public class Next_Prime {


    public static void  NextPrimeNum(int num){

        int  count=0;
        for (int i=1;i<=num;i=i+1){

         if(num%i==0){
             count=count+1;
         }
        }

        if(count==2){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }


        int n=num;
        while (true){
            n=n+1;
            int  count1=0;
            for (int i=1;i<=n;i=i+1){

                if(n%i==0){
                    count1=count1+1;
                }
            }

            if(count1==2){
                System.out.println(n+" is prime number");
                break;
            }



        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int x=sc.nextInt();

        NextPrimeNum(x);
    }
}
