package SnakeAndLadder.Domain.Service;

import SnakeAndLadder.Domain.Board;
import SnakeAndLadder.Domain.Ladder;
import SnakeAndLadder.Domain.Players;
import SnakeAndLadder.Domain.Snake;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
// Add on functionalities:
// 1 game should start at 6
//2 extra turn till player keeps on getting 6
// 3. overlapping snakes and ladders  - HW
// 4. start with 6 , but first 6 should take it to 1

// Soumya ->  first 6 should only mark player to be into the game and at 0

public class gameServiceImpl implements gameService {
    //actual methode to play the game.
    //
    public Players playGame(Board board, Players[] players) {
        boolean gameover=false;
        HashMap<Integer,Integer> snakemap=new HashMap<>();
        Snake[] snakes=board.getSnakeList();
        for(Snake s:snakes){
            snakemap.put(s.getHeadPosition(), s.getTailPosition());
        }
        HashMap<Integer,Integer> laddermap=new HashMap<>();
        Ladder[] ladders= board.getLadderList();
        for(Ladder l:ladders){
            laddermap.put( l.getStartPosition(),l.getEndPosition());
        }

        //merging two hashmap
//        snakemap.putAll(laddermap);

        int CurrentPlayerIndex =0;
        int minDice=1;
        int maxDice=6;
        Random random=new Random();
        Players playerPlaying=null;
        int totalCells= board.getNoOfCells();
        int totalPlayer=players.length;
        while(!gameover){
            //continue taking turns to over
            playerPlaying=players[CurrentPlayerIndex];
            //roll the dice
            int DiceNumber=random.nextInt(6)+minDice;
            int oldPos=playerPlaying.getPlayerPosition();
            int newPos=oldPos+DiceNumber;
            //Enhancement no 4:
            if (oldPos==0 && DiceNumber==6){
                playerPlaying.setFlag(true);
                CurrentPlayerIndex=getNextPlayerIndex(totalPlayer,CurrentPlayerIndex);
                System.out.println(playerPlaying.getPlayerName()+" into this game ");
                continue;
            }
            //Enhansement no 1:
            if (oldPos==0 && !playerPlaying.isFlag()){
                CurrentPlayerIndex=getNextPlayerIndex(totalPlayer,CurrentPlayerIndex);
                System.out.println(playerPlaying.getPlayerName() +" has rolled a dice with number "+ DiceNumber +" Moving to next player . Invalid to start. ");
                continue;
            }
//            //Enhansement no 1:
//            if (oldPos==0 && DiceNumber!=6){
//                CurrentPlayerIndex=getNextPlayerIndex(totalPlayer,CurrentPlayerIndex);
//                System.out.println(playerPlaying.getPlayerName() +" has rolled a dice with number "+ DiceNumber +" Moving to next player . Invalid to start. ");
//                continue;
//            }
//            //Enhancement by Soumya:
//            if(oldPos==0 && DiceNumber==6 && playerPlaying.isFlag()){
//                playerPlaying.setFlag(true);
//                CurrentPlayerIndex=getNextPlayerIndex(totalPlayer,CurrentPlayerIndex);
//                System.out.println(playerPlaying.getPlayerName()+"into this game");
//                continue;
//            }
//
//            //Enhancement no 4:
//            if (oldPos==0 && DiceNumber==6){
//                newPos=1;
//                System.out.println(playerPlaying.getPlayerName() +" has rolled a dice with number "+ DiceNumber +" At pos 0 and got 6 so his/her newPos is 1");
//            }

            if (newPos>totalCells){//new po s is going out of bound
                //move to next turn:
                CurrentPlayerIndex=getNextPlayerIndex(totalPlayer,CurrentPlayerIndex);
                continue;
            }

            //check for snakes and ladders
            newPos = tackleWithSnakemapAndLaddermap(snakemap, laddermap,newPos);

            playerPlaying.setPlayerPosition(newPos);
            System.out.println(playerPlaying.getPlayerName()+" has rolled dicewithe number "+DiceNumber+" move from "+oldPos+" to "+newPos);

            if(newPos==totalCells){
                System.out.println("game is over");
                gameover=true;
            }
            //Enhancement no 2
            if (oldPos!=0 && DiceNumber==6){
                System.out.println("Give extra turn because player got 6");
                continue;
            }
            //move to the next player:
            CurrentPlayerIndex=getNextPlayerIndex(totalPlayer,CurrentPlayerIndex);
        }
       // System.out.println(playerPlaying+"Wins The Game");
        return playerPlaying;
    }

/*
   private static int tackleWithSnakemapAndLaddermap(HashMap<Integer, Integer> snakemap, int newPos) {
        for (HashMap.Entry<Integer,Integer> entry : snakemap.entrySet()){
            if(snakemap.containsKey(newPos)){
                newPos = snakemap.get(newPos);
            }
        }
        return newPos;
    }
*/

    private static int tackleWithSnakemapAndLaddermap(HashMap<Integer, Integer> snakemap, HashMap<Integer, Integer> laddermap, int newPos) {
        int count=0;
        while(laddermap.containsKey(newPos) || snakemap.containsKey(newPos)) {
            count++;
            if (laddermap.containsKey(newPos)) {
                newPos = laddermap.get(newPos);
            } else if (snakemap.containsKey(newPos)) {
                newPos = snakemap.get(newPos);
            }
        }
        System.out.println(count);
        return newPos;
    }

    private int getNextPlayerIndex(int totalPlayers,int currentPlayerIndex){
        if(currentPlayerIndex+1==totalPlayers){
            return 0;
        }
        return currentPlayerIndex+1;
    }
}
