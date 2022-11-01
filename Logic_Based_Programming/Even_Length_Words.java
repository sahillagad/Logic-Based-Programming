package Logic_Based_Programming;

public class Even_Length_Words {

    public static void evenWord(String str){



       String[] strings=str.trim().split(" ");


       for(int i=0;i<strings.length;i=i+1){
      if(strings[i].length()%2==0){
          System.out.println(strings[i]);
      }

       }
        System.out.println("-----------------------------------");
   }


    public static void main(String[] args) {



        evenWord("This is a java language");
        evenWord("i am GFG");

    }


}
