package Snake&Ladder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import Snake.SLPlayer;

public class Game {
    BoardGame board;
    Deque<SLPlayer> playerList = new ArrayDeque<>();
    Dice dice;
    SLPlayer winer = null;

    void initialize(int boardSize, List<SLPlayer> players, int number_of_dice) {
        this.board = new BoardGame(boardSize);

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                this.board.cells[i][j] = new Cell();
            }
        }

        this.dice = new Dice(number_of_dice);
        players.forEach(player -> {
            playerList.addLast(player);
        });
    }

    void startGame() {

        while (winer == null) {
            SLPlayer currPlayer = playerList.getFirst();
            int jump = dice.rollDice();
            currPlayer.current_position = validateJump(currPlayer.current_position + jump);
            if (currPlayer.current_position >= 99) {
                winer = currPlayer;
                break;
            }
            playerList.addLast(currPlayer);

        }
    }

    int validateJump(int position) {
        Cell cell = board[position / 10][position % 10];
        if (cell.jump == null) {
            return position;
        }
        Jump jumpObj = cell.jump;
        return jump.end;
    }

}
