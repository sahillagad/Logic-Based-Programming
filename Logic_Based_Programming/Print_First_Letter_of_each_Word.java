package Logic_Based_Programming;

public class Print_First_Letter_of_each_Word {

     public static void Check(String str){

         String[] strings=str.trim().split(" ");






       String s="";
      for (int i=0;i<strings.length;i=i+1){

           if(strings[i].length()>0) {
               s = s + strings[i].charAt(0);

           }
      }
         System.out.println("Input  : "+str);
         System.out.println("Output : "+s);
         System.out.println("---------------------");

     }


    public static void main(String[] args) {


        Check("geeks for geeks");
        Check("Sahil");
        Check("happy   coding");



    }
}
