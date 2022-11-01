package Logic_Based_Programming;

public class Space_between_each_character {

     public static void SpaceEachChar(String str){


         StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i=i+1){
            sb.append(str.charAt(i)+" ");
        }

         System.out.println(sb);
    }

    public static void main(String[] args) {


    SpaceEachChar("GeeksForGeeK");

    }
}
