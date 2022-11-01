package Logic_Based_Programming;

import java.util.Scanner;

/*
The e-commerce company BookShelf wishes to analyze its monthly sales data between minimum range 30 and maximum range 100.

The company has categorized these books sales into four groups depending on the number of sales. With the help of these groups,
 the company will know which stock they should increase or decrease in their inventory for the next month.

The groups are as follows :

Sales Range   	Groups
30 - 50	          D
51 - 60	          C
61 - 80           B
81 - 100	      A

Write an algorithm to find the group for a given book sale count.
Input :
The input consists of an integer saleCount, representing the total sales of a book.
Output :
Print a character representing the group for a given sale count.
 */
public class E_COMMERCE_SALES {

    public static void SalesRange(int n){

        if(n>=30 && n<=50){

            System.out.println("D :- Groups categorized ");
        }
        else if(n>51 && n<=60){

            System.out.println("C :- Groups categorized ");
        }
        else if (n>61 && n<=80) {

            System.out.println("B :- Groups categorized ");
        }
        else if (n>81 && n<=100) {
            System.out.println("A :- Groups categorized");
        }


    }


    public static void main(String[] args) {

        System.out.println("Enter total sales of a book.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SalesRange(n);

    }
}
