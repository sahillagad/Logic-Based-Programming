package Logic_Based_Programming;

public class Index_of_first_vowel {

    public  static void indexVowel(String str){

        String vowel="aeiou";

        boolean output=true;
        for (int i=0;i<str.length();i=i+1){

            for (int j=0;j<vowel.length();j=j+1) {

                if(str.charAt(i)==vowel.charAt(j)){

                    System.out.println("Vowel : "+str.charAt(i)+" Index : "+i);
                    output=false;
                    break;
                }

            }
            if (output==false){
                break;
            }
        }


    }

    public static void main(String[] args) {

        indexVowel("sahil");
        indexVowel("Bhaskar");



    }
}
