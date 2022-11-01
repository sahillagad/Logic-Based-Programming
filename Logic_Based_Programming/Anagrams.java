package Logic_Based_Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagrams {

/*
An anagram of a string is another string that contains the
same characters, only the order of characters can be different.
For example, “abcd” and “dabc” are an anagram of each other.
 */

    public  static  void CheckAnagrams(String str1,String str2){

        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<str1.length();i=i+1){

            if(hashMap.get(str1.charAt(i))==null){
                hashMap.put(str1.charAt(i),1);
            }
            else{
               Integer x=hashMap.get(str1.charAt(i));
               x=x+1;
               hashMap.replace(str1.charAt(i),x);
            }
        }

        System.out.println("---------------------------");
//
        HashMap<Character,Integer> hashMap1=new HashMap<>();
        for(int j=0;j<str2.length();j=j+1){

            if(hashMap1.get(str2.charAt(j))==null){
                hashMap1.put(str2.charAt(j),1);
            }
            else{
                Integer x1=hashMap1.get(str2.charAt(j));
                x1=x1+1;
                hashMap1.replace(str2.charAt(j),x1);
            }
        }



       Set<Map.Entry<Character,Integer>> entries=hashMap.entrySet();
      Set<Map.Entry<Character,Integer>> entries1=hashMap1.entrySet();


      int count=0;
        for(Map.Entry<Character,Integer> entry:entries){

            for(Map.Entry<Character,Integer> entry1:entries1) {

                if(entry.getKey()==entry1.getKey()){

                 if(entry.getValue()==entry1.getValue()){

                     count=count+1;
                 }
                }
            }
        }

        if(str1.length()==count){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String ");
        String str1=sc.next();
        System.out.println("Enter Second String ");
        String str2=sc.next();

        CheckAnagrams(str1,str2);
    }
}
