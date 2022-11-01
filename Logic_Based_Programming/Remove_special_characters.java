package Logic_Based_Programming;

public class Remove_special_characters {

    public static void specialChar(String str) {
        String specialchar = "#%^&*@!\\$";

        String str1="";
        for (int i = 0; i < str.length(); i = i + 1) {

            String ch=String.valueOf(str.charAt(i));
            boolean b=true;
            for (int j=0;j<specialchar.length();j=j+1){

             if(str.charAt(i)==specialchar.charAt(j)){

                 b=false;
             }

            }

            if(b==true){
                str1=str1+ch;
            }
        }

        System.out.println(str1);
    }

    public static void main(String[] args) {
        String str = "one$two$three$four!five@six$";
        specialChar(str);

    }

    ;
}