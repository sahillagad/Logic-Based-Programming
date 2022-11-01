package Logic_Based_Programming;

public class Get_word_count {

    public  static  void wordCount(String s){
        String x=s.trim();
        int count=0;
        for (int i=0;i<x.length();i=i+1){

            if(x.charAt(i)==' '){
                count=count+1;
            }
        }

        System.out.println(x);
        System.out.println(count+1);
    }


    public static void main(String[] args) {

        String s="Simple Java Word Count Program";
        wordCount(s);

    }
}
