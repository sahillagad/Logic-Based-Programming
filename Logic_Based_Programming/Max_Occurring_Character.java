package Logic_Based_Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Max_Occurring_Character {

    public static void CountChar(String str){

        HashMap<Character,Integer> hashMap=new HashMap<>();

        for (int i=0;i<str.length();i=i+1){

            if(hashMap.get(str.charAt(i))==null){

                hashMap.put(str.charAt(i),1);
            }
            else{
                hashMap.replace(str.charAt(i),((hashMap.get(str.charAt(i)))+1));

            }

        }




       Set<Map.Entry<Character,Integer>> entries=hashMap.entrySet();

       int notepad=Integer.MIN_VALUE;
       Character  s = null;
        for(Map.Entry<Character,Integer> entry:entries){

          if(entry.getValue()>=notepad){
              notepad=entry.getValue();
              s=entry.getKey();
          }


       }

        System.out.println(s+" occurs "+ notepad +" times in the string");
    }

    public static void main(String[] args) {

        CountChar("geeksforgeeks");
        CountChar("test");
    }
}
