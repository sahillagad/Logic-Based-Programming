package Logic_Based_Programming;

public class Odd_Even_Online_Game {
    public static void Game(int x,int y,int p){

     while (p!=0){

         if(p%2==1){
             x=x*2;
         }
         if (p%2==0){
             y=y*2;
         }
         p=p-1;
     }


      if (x>=y) {
          System.out.println("Final value : " + (x/y));
      }
      else if(x<y){

          System.out.println("Final value : "+(y/x));
      }
    }

    public static void main(String[] args) {

        Game(1,2,1);

        Game(3,7,2);

    }
}
