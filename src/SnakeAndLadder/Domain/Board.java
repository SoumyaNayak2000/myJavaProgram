package SnakeAndLadder.Domain;

public class Board {
    private int noOfCells;
    int noOfSnakes;
    int noOfLadders;
    Snake[] snakeList;
    Ladder[] ladderList;
    Board(int cells,int snakes,int ladders,Snake[] snakeList,Ladder[] ladderList){
        this.noOfCells=cells;
        this.noOfSnakes=snakes;
        this.noOfLadders=ladders;
        this.snakeList=snakeList;
        this.ladderList=ladderList;
    }

    public Snake[] getSnakeList() {
        return snakeList;
    }

    public Ladder[] getLadderList() {
        return ladderList;
    }

    public int getNoOfCells() {
        return noOfCells;
    }
}
