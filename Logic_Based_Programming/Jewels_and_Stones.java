package Logic_Based_Programming;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Jewels_and_Stones {

     public static int numJewelsInStones(String jewels,String stones){

         HashMap<Character,Integer> hashMap=new HashMap<>();

         for (int i=0;i<stones.length();i=i+1){

             for (int j=0;j<jewels.length();j=j+1) {

                  if(stones.charAt(i)==jewels.charAt(j)){

                      if(hashMap.get(jewels.charAt(j))==null){

                          hashMap.put((jewels.charAt(j)),1);

                      }else{

                      int x=(Integer.parseInt(String.valueOf(hashMap.get(jewels.charAt(j)))))+1;
                      hashMap.replace(jewels.charAt(j),x);
                      }

                  }

             }
         }

          AtomicInteger counting= new AtomicInteger();
         hashMap.forEach((character, integer) ->{
                 System.out.println(character+" "+integer);
             counting.set(counting.get() + integer);
         });

         System.out.println("Total "+counting);
         return 7;
     }


    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels, stones);
    }
}
