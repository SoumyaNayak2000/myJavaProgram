package SnakeAndLadder.Domain;
//1....100
//7 snakes
//Snake->
//head and tail.
public class Snake {
    int headPosition;
    int tailPosition;
    Snake(int head,int tail){
        this.headPosition=head;
        this.tailPosition=tail;
    }

    public int getHeadPosition() {
        return headPosition;
    }

    public int getTailPosition() {
        return tailPosition;
    }
}
