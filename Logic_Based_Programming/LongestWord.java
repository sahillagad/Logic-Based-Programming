package Logic_Based_Programming;

public class LongestWord {


    public static  void CheckWord(String str){


         String word;
         int smallIndex=Integer.MAX_VALUE;
         int largeIndex=Integer.MIN_VALUE;
         String small="";
         String large="";
         String s = str.trim();
         int count=0;
         for (int p=0;p<s.length();p=p+1){

             if(s.charAt(p)==' '){
                 count=count+1;
             }
         }

         String[] strings=new String[(count+1)];

         strings=str.trim().split(" ");


        for (int i=0;i<strings.length;i=i+1){

           if(smallIndex>=(strings[i].length())){
               smallIndex=strings[i].length();
               small=strings[i];
            }

            if(largeIndex<=(strings[i].length())){
                largeIndex=strings[i].length();
                large=strings[i];

            }
        }


        System.out.println("Small Word : "+small);
        System.out.println("Large Word : "+large);


    }


    public static void main(String[] args) {

        CheckWord("Hardships often prepare ordinary people for an extraordinary destiny");


    }
}
