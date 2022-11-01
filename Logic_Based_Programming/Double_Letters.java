package Logic_Based_Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Double_Letters {

    public  static void CheckDoubleLetters(String str){

        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<str.length();i=i+1){


            if (hashMap.get(str.charAt(i))==null){
                hashMap.put(str.charAt(i),1);
            }
            else{

                hashMap.replace(str.charAt(i),(hashMap.get(str.charAt(i))+1));
            }


        }


       Set<Map.Entry<Character,Integer>> entries=hashMap.entrySet();

        for (Map.Entry<Character,Integer> entry:entries){

            if(entry.getValue()>=2){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

        }



    }


    public static void main(String[] args) {

        CheckDoubleLetters("Great responsibility");
    }
}
