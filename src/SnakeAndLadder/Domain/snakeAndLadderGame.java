package SnakeAndLadder.Domain;

import java.util.Scanner;
import SnakeAndLadder.Domain.Board;
import SnakeAndLadder.Domain.Players;
import SnakeAndLadder.Domain.Service.gameService;
import SnakeAndLadder.Domain.Service.gameServiceImpl;
// Players Soumya = new Players(1575,0,"Soumya");
// Players Suraj  = new Players(1578, 0, "Suraj");

public class snakeAndLadderGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numOfPlayers=sc.nextInt();
        Players[] players=new Players[numOfPlayers];
        for(int i=0;i<numOfPlayers;i++){
            int playerId=sc.nextInt();
            //int playerPosition= sc.nextInt();
            String playerName=sc.next();
            players[i]=new Players(playerId,0,playerName);
        }

        int noOfCells=sc.nextInt();
        int noOfSnake=sc.nextInt();
        int noOfLadder=sc.nextInt();
        Snake[] Snakes=new Snake[noOfSnake];
        for(int i=0;i<noOfSnake;i++){
            int headPos=sc.nextInt();
            int tailPos= sc.nextInt();
            Snakes[i]=new Snake(headPos,tailPos);
        }
       Ladder[] Ladders=new Ladder[noOfLadder];
        for(int i=0;i< noOfLadder;i++){
            int startPos=sc.nextInt();
            int endPos= sc.nextInt();
            Ladders[i]=new Ladder(startPos,endPos);
        }
        Board board=new Board(noOfCells,noOfSnake,noOfLadder,Snakes,Ladders);

        gameService gameservice=new gameServiceImpl();
        Players winner=gameservice.playGame(board,players);
        System.out.println(winner.getPlayerName() + " wins the game ");
    }
}
