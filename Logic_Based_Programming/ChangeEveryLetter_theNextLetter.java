package Logic_Based_Programming;

public class ChangeEveryLetter_theNextLetter {

    public static void CheckNextLetter(String str){

        String str1="";
        Character[] alpha={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

          for (int i=0;i<str.length();i=i+1){
              if(str.charAt(i)==' '){
                  str1=str1+" ";
                  continue;
              }

              for (int j=0;j<alpha.length;j=j+1){

                  if(str.charAt(i)==alpha[j]){
                      if(j==25){
                          str1=str1+alpha[0];
                          break;
                      }
                      if(j<=24) {
                          str1 = str1 + alpha[j + 1];
                      }
                      }


              }

          }

        System.out.println("Input  : "+str);
        System.out.println("Output : "+str1);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {


CheckNextLetter("abcdefz");
CheckNextLetter("abcdefz");
CheckNextLetter("hello world");
    }

}
