package Logic_Based_Programming;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatingLetters {
    //Find the first repeated character in a string

    public static void Repeated(String str){


        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<str.length();i=i+1){


            if (hashMap.get(str.charAt(i))==null){
                hashMap.put(str.charAt(i),1);
            }
            else{

                hashMap.replace(str.charAt(i),(hashMap.get(str.charAt(i))+1));
            }


        }

        hashMap.forEach((character, integer) ->
                System.out.println(character+" "+integer));

    }


    public static void firstRepeated(String str){


        HashSet<Character> characters=new HashSet<>();

        for (int i=0;i<str.length();i=i+1){

         if(characters.contains(str.charAt(i))==false){

             characters.add(str.charAt(i));
         }
         else{

             System.out.println("First Repeating Character :- "+str.charAt(i));
             break;
         }

        }
    }

    public static void main(String[] args) {
        Repeated("geeksforgeeks");
        firstRepeated("geeksforgeeks");
    }
}
