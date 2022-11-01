package Logic_Based_Programming;

import java.util.Scanner;

public class XandONobodyknows {

    public static  String[] board={
            " 1 "," 2 "," 3 ",
            " 4 "," 5 "," 6 ",
            " 7 "," 8 "," 9 "
    };
    public  static int turn;
    public static String player1;
    public static String player2;

    public static void printBoard(){

        System.out.println(
                "|"+board[0]+"|"+board[1]+"|"+board[2]+"|"+"\n"+
                "|"+board[3]+"|"+board[4]+"|"+board[5]+"|"+"\n"+
                "|"+board[6]+"|"+board[7]+"|"+board[8]+"|"+"\n"

        );


    }

    public static void winner(){

        if(board[0].equals(" O ") && board[1].equals(" O ") && board[2].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[3].equals(" O ") && board[4].equals(" O ") && board[5].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[6].equals(" O ") && board[7].equals(" O ") && board[8].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[0].equals(" O ") && board[4].equals(" O ") && board[8].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[2].equals(" O ") && board[4].equals(" O ") && board[6].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[0].equals(" O ") && board[3].equals(" O ") && board[6].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[1].equals(" O ") && board[4].equals(" O ") && board[7].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[2].equals(" O ") && board[5].equals(" O ") && board[8].equals(" O ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }


/////////////////////////////////////////////////////
        if(board[0].equals(" X ") && board[1].equals(" X ") && board[2].equals(" X ")){
            System.out.println("Congratulations! "+player1+"'s have won! Thanks for playing. " );
        }
        if(board[3].equals(" X ") && board[4].equals(" X ") && board[5].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
        if(board[6].equals(" X ") && board[7].equals(" X ") && board[8].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
        if(board[0].equals(" X ") && board[4].equals(" X ") && board[8].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
        if(board[2].equals(" X ") && board[4].equals(" X ") && board[6].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
        if(board[0].equals(" X ") && board[3].equals(" X ") && board[6].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
        if(board[1].equals(" X ") && board[4].equals(" X ") && board[7].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
        if(board[2].equals(" X ") && board[5].equals(" X ") && board[8].equals(" X ")){
            System.out.println("Congratulations! "+player2+"'s have won! Thanks for playing. " );
        }
    }

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to 3x3 Tic Tac Toe.\n");
        System.out.println("Enter Player 1 Name ");
        player1=sc.nextLine();

        System.out.println("Enter Player 2 Name ");
          player2=sc.nextLine();

        System.out.println("Player 1 Mark is O");
        System.out.println("Player 2 Mark is X");
        printBoard();
        while (turn!=9){

            if (turn%2==0) {
                System.out.println("Player 1 Mark O write the Position Number");
                int i = sc.nextInt();
                if(  board[i-1]!=" O " && board[i-1]!=" X ") {

                    board[i - 1] = " O ";
                }
                else{
                    System.out.println("Please Enter Correct Position ");
                    System.out.println("Player 1 Mark O write the Position Number");
                    int i1 = sc.nextInt();
                    board[i1 - 1] = " O ";
                }

            } else if (turn%2==1) {
                System.out.println("Player 2 Mark X write the Position Number");
                int J = sc.nextInt();


                if(  board[J-1]!=" O " && board[J-1]!=" X ") {

                    board[J-1]=" X ";
                }
                else{
                    System.out.println("Please Enter Correct Position ");
                    System.out.println("Player 2 Mark X write the Position Number");
                    int J1 = sc.nextInt();
                    board[J1-1]=" X ";
                }
            }


            turn=turn+1;
            printBoard();
        }


        winner();
    }

}
