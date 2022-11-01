package Logic_Based_Programming;

public class Count_special_characters {


    public static void specialChar(String str) {
        String specialchar = "#%^&*@!\\$";

        String str1="";
        int count=0;
        for (int i = 0; i < str.length(); i = i + 1) {

            String ch=String.valueOf(str.charAt(i));
            boolean b=true;
            for (int j=0;j<specialchar.length();j=j+1){

                if(str.charAt(i)==specialchar.charAt(j)){

                    b=false;
                    count=count+1;
                }

            }

            if(b==true){
                str1=str1+ch;
            }
        }

        System.out.println("String special characters     :- "+str);
        System.out.println("String not special_characters :- "+str1);
        System.out.println("Count special_characters      :- "+count);
    }

    public static void main(String[] args) {
        String str = "one$two$three$four!five@six$";
        specialChar(str);

    }

    ;
}