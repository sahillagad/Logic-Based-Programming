package Logic_Based_Programming;

public class Find_the_Bomb {

    public  static  char[][]  Bomb(char[][] str){

        for (int i=0;i<str.length;i=i+1) {

            for (int j = 0; j < str[i].length; j = j + 1) {


                if(str[i][j]=='B'){



                    for (int p=0;p<str[i].length;p=p+1){

                        if(str[p][j]!='B'){

                            str[p][j]='X';
                        }

                    }


                    for (int q=0;q<str.length;q=q+1){

                        if(str[i][q]!='B'){

                            str[i][q]='X';
                        }}}
           }
        }


        return str;

    }

    public static void main(String[] args) {


  char[][] matrix={

           "XXEX".toCharArray(),
           "XBXX".toCharArray(),
           "XEXX".toCharArray(),
           "XXXX".toCharArray()
   };

  int count=0;
   char[][] str= Bomb(matrix);
        for (int i=0;i<str.length;i=i+1) {

            for (int j = 0; j < str[i].length; j = j + 1) {

               if(str[i][j]=='E'){
                   count=count+1;
               }
            }
            }

       if(count==0){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }





    }
}
