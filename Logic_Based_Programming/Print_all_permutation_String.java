package Logic_Based_Programming;

public class Print_all_permutation_String {

    public static void printPermutation(String str){

        for (int i=0;i<str.length();i=i+1){
            StringBuilder sb=new StringBuilder();
            for (int j=i;j<str.length();j=j+1){
            sb.append(str.charAt(j));

                System.out.println(sb);
            }
        }

    }

    public static void main(String[] args) {

       printPermutation("sahil");

    }

}
