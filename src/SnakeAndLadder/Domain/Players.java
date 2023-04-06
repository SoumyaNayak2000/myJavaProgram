package SnakeAndLadder.Domain;

public class Players {
    int playerPosition;
    int playerId;
    String playerName;
    boolean flag=false;
    public Players(int playerid, int playerPosition, String playerName){
        this.playerId=playerid;
        this.playerPosition=playerPosition;
        this.playerName=playerName;
    }
    public int getPlayerPosition() {
        return playerPosition;
    }
    public int getPlayerId() {
        return playerId;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}