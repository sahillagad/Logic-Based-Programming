package Logic_Based_Programming;

import java.util.HashMap;

public class Color_chess_board_square {

    public static void chessboard(String coordinates){

// 0=white 1=black
       int[][] chess= {
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0},
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0},
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0},
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0}
        };

        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("a",0);
        hashMap.put("b",1);
        hashMap.put("c",2);
        hashMap.put("d",3);
        hashMap.put("e",4);
        hashMap.put("f",5);
        hashMap.put("g",6);
        hashMap.put("h",7);


       int col=hashMap.get(String.valueOf(coordinates.charAt(0)));
       int row=Integer.parseInt(String.valueOf(coordinates.charAt(1)));
       int square=chess[row][col];
       if(square==0){
           System.out.println("white");
       }
       else{
           System.out.println("black");
       }

    }




    public static void main(String[] args) {

        chessboard("a1");
        System.out.println("----------------");
        chessboard("h3");
        System.out.println("----------------");
        chessboard("c7");
    }
}
