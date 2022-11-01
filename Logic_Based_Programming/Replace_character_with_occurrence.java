package Logic_Based_Programming;

public class Replace_character_with_occurrence {

    public static void Replace(String str,char OldChar,char UpdateChar){

        String s="";
        for(int i=0;i<str.length();i=i+1){
            if(str.charAt(i)==OldChar){
                s=s+UpdateChar;
                 continue;
            }
            s=s+str.charAt(i);
        }

        System.out.println("Input  : "+str);
        System.out.println("Output : "+s);
    }


    public static void main(String[] args) {

        Replace("THIS IS DEMO LINE $$$ NEW LINE",'I','@');

    }
}
