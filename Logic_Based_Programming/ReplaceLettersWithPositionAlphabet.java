package Logic_Based_Programming;

import java.util.ArrayList;

public class ReplaceLettersWithPositionAlphabet {

    public static void Replace(String str){
        char[] chars={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Integer[] inte={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20,21,22,23,24,25};

       String str1="";
        for (int i=0;i<str.length();i=i+1){

            for (int j=0;j<chars.length;j=j+1) {
                if (str.charAt(i)==chars[j]){

                    str1=str1+(inte[j]+" ");

                }

            }
        }


        System.out.println("[ "+str1+"]");

    }

    public static void main(String[] args) {

 Replace("sahil");

    }


}

