package Logic_Based_Programming;

public class Swap_corner_words_reverse_middle_characters {

    public static void swapWord(String str){

        String s=str.trim();
        int count=0;
        for (int i=0;i<s.length();i=i+1){

            if(s.charAt(i)==' '){
                count=count+1;
            }

        }

        String[] strings=new String[(count+1)];
        strings=str.trim().split(" ");

        int left=0;
        int rigth=strings.length-1;
        while (left!=rigth) {
            String temp = strings[left];
            strings[left] = strings[rigth];
            strings[rigth] = temp;

            left++;
            rigth--;
        }
        for(int j=1;j<(strings.length-1);j=j+1){

             String temp1=strings[j];
              String s1="";
              for(int k=temp1.length()-1;k>=0;k=k-1){

                  s1=s1+temp1.charAt(k);
              }

              strings[j]=s1;
        }


        String query="";
        for (int m=0;m<strings.length;m=m+1){

            query=query+strings[m]+" ";

        }

        System.out.println(query);

    }


    public static void main(String[] args) {

        swapWord("Hello World GFG Welcomes You");
    }
}
