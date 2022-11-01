package Logic_Based_Programming;

public class Capitalize_Every_word_first_character {

    public static void FirstCapital(String str){

        String[] strings=str.trim().split(" ");

        String s="";
        for (int i=0;i<strings.length;i=i+1){
            s=s+strings[i].substring(0,1).toUpperCase()+strings[i].substring(1,strings[i].length())+" ";
        }
        System.out.println("Input  : "+str);
        System.out.println("Output : "+s);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        FirstCapital("Capitalize Every word first character");
        FirstCapital("javatpoint");
        FirstCapital("website");
        FirstCapital("@javatpoint");



    }


}
