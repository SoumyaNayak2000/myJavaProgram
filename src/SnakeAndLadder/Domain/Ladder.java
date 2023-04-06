package SnakeAndLadder.Domain;
//startoos,end pos
public class Ladder {
    int startPosition;
    int endPosition;
    Ladder(int start,int end){
        this.startPosition=start;
        this.endPosition=end;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }
}
