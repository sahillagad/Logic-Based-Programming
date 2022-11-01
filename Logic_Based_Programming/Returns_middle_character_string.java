package Logic_Based_Programming;

public class Returns_middle_character_string {

    public static void middleChar(String str){


        int n=str.length();

        if(n%2==0){

            System.out.println(str.charAt((n/2)));
        }
        if(n%2==1){
            System.out.println(str.charAt(((n-1)/2)));
        }



    }

    public static void main(String[] args) {

        middleChar("sahil");
        middleChar("abcdef");
        middleChar("abcdefg");
    }
}
