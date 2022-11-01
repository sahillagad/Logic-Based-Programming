package Logic_Based_Programming;

import java.util.HashSet;

public class First_N_Vowels {

    public static void FindVowels(String str,int n){

        String vowel="aeiou";
        String s="";
        int count=0;
        for (int i=0;i<str.length();i=i+1){
            boolean b=false;
            for (int j=0;j<vowel.length();j=j+1) {

                if(str.charAt(i)==vowel.charAt(j)){
                   s=s+str.charAt(i)+" ";
                    count=count+1;
                    if(count==n){
                        b=true;
                        break;
                    }}}
            if(b==true){
                break;
            }
        }

        System.out.println(s+" are the first "+n+" vowels in the given ");
    }


    public static void main(String[] args) {
FindVowels("GeeksForGeeks",3);
FindVowels("softcopy",5);
    }
}
