package Logic_Based_Programming;

import java.util.Scanner;

public class Sum_of_Digits{


    public static  void   sumAllNumber(int[] arr){
        var sum=0;
        for (int i=0;i<arr.length;i=i+1){
         sum=sum+arr[i];
        }
        System.out.println("Sum of All Digit :- "+sum);
    }

    public static  void   evenSumAllNumber(int[] arr) {
        var sum=0;
        for (int i=0;i<arr.length;i=i+1){
            if(arr[i]%2==0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of All Even Digit :- "+sum);
    }


    public static  void   oddSumAllNumber(int[] arr) {
        var sum=0;
        for (int i=0;i<arr.length;i=i+1){
            if(arr[i]%2==1) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of All Odd Digit :- "+sum);
    }
    public static void sumPrimeDigits(int[] arr){


        for(int i=0;i<arr.length;i=i+1){

            int num=arr[i];
            int count=0;
            for (int y=1;y<=num;y=y+1){

                if((num%y)==0) {

                    count=count+1;
                }


            }
            if(count==2){
                System.out.println(num +" Prime Number");
            }
            else{
                System.out.println(num +" Not Prime Number");
            }


        }
    }

    public static void sumNumberDivisible(int[] arr){


        int sum=0;
        for(int i=0;i<arr.length;i=i+1) {

            if(arr[i]%3==0){

                sum=sum+arr[i];
            }


        }
        System.out.println("sum Number Divisible by 3 :- "+sum);

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Total Number You Want To Enter");
        int num=sc.nextInt();

        int[] arr=new int[num];

        for (int i=0;i<num;i=i+1){
            System.out.println("Enter Number");
            int x=sc.nextInt();
            arr[i]=x;
        }


        while (true) {
            System.out.println("Press 1 For sum All Number");
            System.out.println("Press 2 For sum Even All Number");
            System.out.println("Press 3 For sum Odd All Number");
            System.out.println("Press 4 For sum of Prime Number");
            System.out.println("Press 5 For Sum of Digits  divisible by 3");
            System.out.println("Press 6 For Exit");
            int result=sc.nextInt();

            if(result==1){
                sumAllNumber(arr);
            }
            if(result==2){
                evenSumAllNumber(arr);
            }
            if(result==3){
                oddSumAllNumber(arr);
            }
            if(result==4){
                sumPrimeDigits(arr);
            }
            if(result==5){

                sumNumberDivisible(arr);
            }
            if(result==6){

                break;
            }



        }


        System.out.println("Thank You");


    }
}
