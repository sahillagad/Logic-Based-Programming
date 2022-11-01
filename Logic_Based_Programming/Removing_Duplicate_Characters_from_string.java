package Logic_Based_Programming;

import java.util.HashSet;

public class Removing_Duplicate_Characters_from_string {

    public static void RemoveDuplicate(String str){

        HashSet<Character> set=new HashSet<>();

         String s="";
        for(int i=0;i<str.length();i=i+1){

          if(set.contains(str.charAt(i))==false){
              s=s+str.charAt(i);
              set.add(str.charAt(i));
          }

        }

        System.out.println("Input : "+str);
        System.out.println("Output : "+s);

    }

    public static void main(String[] args) {

       RemoveDuplicate("GeeksForGeeK");

    }

}
