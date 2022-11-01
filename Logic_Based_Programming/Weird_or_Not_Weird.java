package Logic_Based_Programming;

import java.util.Scanner;

/* Java If-Else
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
Task
Given an integer, n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
Input Format
A single line containing a positive integer, n.
Constraints
1 <= n <= 100
Output Format
Print Weird if the number is weird; otherwise, print Not Weird. */
public class Weird_or_Not_Weird {
    public static void main(String[] args) {


        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==1){

            System.out.println("Weird");
        }
        else if(n%2==0){

            if(n>=2 && n<=5){
                System.out.println("Not Weird");
            }
            else if (n>=6 && n<=20) {

                System.out.println("Weird");
            }
            else if(n>20){
                System.out.println("Not Weird");
            }
        }









    }





}
