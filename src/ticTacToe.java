import java.sql.SQLOutput;
import java.util.*;
public class ticTacToe {
    public static void tictactoe(char player1,char player2){
        if(player1=='R' || player2=='R'){
            System.out.println("R");
        }
        else if(player1=='J' || player2=='J'){
            if(player1=='J'){
                System.out.println(player2);
            }
            else{
                System.out.println(player1);
            }
        }
        else
        {
            System.out.println("D");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char player1=s.charAt(0);
        char player2=s.charAt(2);
        tictactoe(player1,player2);
    }
}
//Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
//        Game is played in pairs.
//        If Rick plays against anyone, Rick wins.
//        If Jerry plays against anyone, Jerry Loses.
//        A game between any other players is a draw.
//        Given a pair of players, find who wins the game or if the game is draw.
