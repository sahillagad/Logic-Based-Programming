package Logic_Based_Programming;

public class Stuttering_Function {

    public static void   Stuttering(String str){

        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i=i+1){


            sb.append(str.charAt(i));
            sb.append(str.charAt(i));

        }

        System.out.println(sb);

    }

    public static void main(String[] args) {


        Stuttering("Hello!");
    }
}
