package Logic_Based_Programming;

public class Number_vowels {

    public static void CountVowel(String str) {

        String vowel="aeiou";
        int count=0;
        for (int i = 0; i<str.length();i=i+1){
            for(int j=0;j<vowel.length();j=j+1) {

                   if(str.charAt(i)==vowel.charAt(j)){

                       count=count+1;
                   }

            }
        }
        System.out.println(count+" OF Vowels");
   }


    public static void main(String[] args) {

        CountVowel("sahil");

    }
}
