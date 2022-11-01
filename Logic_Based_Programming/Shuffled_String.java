package Logic_Based_Programming;

public class Shuffled_String {

    public static String  CheckShuffledString(String str1,String str2){



        for(int i=0;i<str2.length();i=i+1){
            StringBuilder sb=new StringBuilder();

            for(int j=i;j<str2.length();j=j+1) {

                 sb.append(str2.charAt(j));
                 String s= sb.toString();
                 if(s.equalsIgnoreCase(str1)) {
                     return "Yes";
                 }
            }

        }
        return "No";

    }



    public static void main(String[] args) {

        String str1="fourtwoone";
        String str2="hellofourtwooneworld";
        if(str2.length()>=str1.length()) {
            String s = CheckShuffledString(str1, str2);
            System.out.println(s);
        }
        else{
            System.out.println("No");
        }

    }
}
