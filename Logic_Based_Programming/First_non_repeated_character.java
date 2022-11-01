package Logic_Based_Programming;

public class First_non_repeated_character {

    public static void CheckNonRepeated(String str){

      boolean b=false;
        for(int i=0;i<str.length();i=i+1){
            char c=str.charAt(i);
            int count=0;
           for (int j=0;j<str.length();j=j+1){


                   if (c == str.charAt(j)){
                       count=count+1;
                   }}

           if(count==1){
               System.out.println("First non repeated character : "+c);
              b=true;
                break;
           }
        }
        if (b==false){
            System.out.println("Either all characters are repeating or \"\n" +
                    "            \"string is empty");
        }

   }


    public static void main(String[] args) {

         CheckNonRepeated("geeksforgeeks");
         CheckNonRepeated("algorithm");
         CheckNonRepeated("Sahil");
         CheckNonRepeated("aabbccdd");

 }
}
