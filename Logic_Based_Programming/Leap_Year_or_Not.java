package Logic_Based_Programming;

import java.util.Scanner;

/*
If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
The year is a leap year (it has 366 days).
The year is not a leap year (it has 365 days).
 */
public class Leap_Year_or_Not {

     public static void leapyYearFind(int year) {


         if (year % 4 == 0) {
                  if(year%100==0){
                      if(year%400==0){
                          System.out.println("Leap year");
                      }
                      else{
                          System.out.println("Not Leap Year");
                      }
                  }
                  else{
                      System.out.println("Leap Year");
                  }

         }
         else {
             System.out.println("Not Leap Year");
         }



     }


    public static void main(String[] args) {

        System.out.println("Enter Year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
       leapyYearFind(year);





    }
}
