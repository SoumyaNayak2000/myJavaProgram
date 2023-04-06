package SnakeAndLadder.Domain.Service;

import SnakeAndLadder.Domain.Board;
import SnakeAndLadder.Domain.Players;

public interface gameService {
    Players playGame(Board board, Players[] players);
}
