package Logic_Based_Programming;

public class Is_the_String_is_in_Order {

    public  static void Sort(String str) {

        char[] chars=str.toCharArray();

        for (int i=0;i<chars.length;i=i+1){
            for (int j=i+1;j<chars.length;j=j+1) {

          if(chars[i]>chars[j]){
              char temp=chars[i];
              chars[i]=chars[j];
              chars[j]=temp;
          }}}


        String s="";
        for (char c:chars){

            s=s+c;
        }

        System.out.println("Input  : "+str);
        System.out.println("Output : "+s);
    }

    public static void main(String[] args) {

        Sort("geeksforgeeks");


    }
}
