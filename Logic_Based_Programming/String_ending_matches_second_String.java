package Logic_Based_Programming;

public class String_ending_matches_second_String {


    public static void  StringEndingMatches(String str1,String str2){
        int str1Length=str1.length();
        int str2Length=str2.length();
        int n=(str1Length-str2Length);
        String start=str1.substring(0,str2Length);
        String end=str1.substring(n,str1Length);



        if(start.equalsIgnoreCase(str2) && end.equalsIgnoreCase(str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }


    public static void main(String[] args) {
        String s1="shreya dhatwalia";
        String s2="abc";

        StringEndingMatches(s1,s2);


    }
}
