package Logic_Based_Programming;

import java.util.Scanner;

public class Discount_New_Years_holiday {

     public static float Discount(int MarketPrice,int SellingPrice){

      float DiscountValue=(MarketPrice-SellingPrice);
      float DiscountPer=((DiscountValue/MarketPrice)*100);

      return DiscountPer;
     }




    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Market Price");
         int MarketPrice=sc.nextInt();
        System.out.println("Enter Selling Price");
         int SellingPrice=sc.nextInt();
        float x= Discount(MarketPrice,SellingPrice);
        System.out.println("Discount Percentage :- "+x);

    }
}