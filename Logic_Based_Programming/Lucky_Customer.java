package Logic_Based_Programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
A number is called lucky if the sum of its digits, as well as the sum of the squares of its digits is a prime number.
How many numbers between  and  inclusive, are lucky?
For example,  and . Each number is tested below:
        digit   digit   squares
value   sum     squares sum
20      2       4,0     4
21      3       4,1     5
22      4       4,4     8
23      5       4,9     13
24      6       4,16    20
25      7       4,25    29
We see that two numbers, ,  and  are lucky.
Note: These lucky numbers are not to be confused with Lucky Numbers
 */
public class Lucky_Customer {


    public static void LuckyCustomerCheck(int n1,int n2) {

         int[] arr=new int[((n2-n1)+1)];
        int[] arr1=new int[((n2-n1)+1)];
        int[] arr2=new int[((n2-n1)+1)];
        int index=0;
        for (int i = n1; i <= n2; i = i + 1) {

            String str = Integer.toString(i);
            int sum = 0;
            int squares = 0;
            for (int j = 0; j < str.length(); j = j + 1) {

                int num = Integer.parseInt(String.valueOf(str.charAt(j)));
                sum = sum + num;
                squares = squares + ((int) (Math.pow(num, 2)));
            }
            arr[index]=i;
            arr1[index]=sum;
            arr2[index]=squares;
            index=index+1;


        }




             for(int k=0;k<arr.length;k=k+1) {


                 int integer=arr1[k];
                 int integer2=arr2[k];

                 int count1 = 0;
                 int count2 = 0;
                 for (int p = 1; p <=integer; p = p + 1) {
                     if (integer % p == 0) {
                         count1 = count1 + 1;
                     }
                 }

                 for (int q = 1; q <= integer2; q = q + 1) {
                     if (integer2 % q == 0) {
                         count2 = count2 + 1;
                     }
                 }

                 if((count1==2) && (count2==2)){

                     System.out.println(arr[k]);

                 }
             }



    }

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1 ");
        int n1=sc.nextInt();

        System.out.println("Enter Number2 ");
        int n2=sc.nextInt();
        LuckyCustomerCheck(n1,n2);

    }
}
