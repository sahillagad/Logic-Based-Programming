package Logic_Based_Programming;

public class Remove_Every_vowel_from_String {

    public static void RemoveVowel(String str){

        String vowel="aeiou";
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i=i+1){
             boolean b=true;
            for (int j=0;j<vowel.length();j=j+1) {
                if (str.charAt(i)==vowel.charAt(j)) {
                   b=false;
                    break;
                }
            }
            if (b==true){

                sb.append(str.charAt(i));
            }


        }

        System.out.println(sb);
    }

    public static void main(String[] args) {

 RemoveVowel("Sahil");

    }
}
