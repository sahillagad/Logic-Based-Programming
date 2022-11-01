package Logic_Based_Programming;

import java.util.HashSet;

public class Pangrams {

    public static String ChreckPangram(String str){

        char[] chars={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};




        char[] chars1=str.toLowerCase().toCharArray();

       if(chars1.length>=26){

           HashSet<Character> set=new HashSet<>();

           for(int i=0;i<chars1.length;i=i+1){
               set.add(chars1[i]);
           }


           for (int j=0;j<chars.length;j=j+1){

             if(set.contains(chars[j])==false){

                 return "No";
             }

           }
           return "Yes";

       }
       else{
           return "No";
       }
    }


    public static void main(String[] args) {



     String s= ChreckPangram("Abcdefghijklmnopqrstuvwxyz");
        System.out.println(s);

        String s1=ChreckPangram("GeeksForGeeks");
        System.out.println(s1);


        String s2=ChreckPangram("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(s2);
    }

}
