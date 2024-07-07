public abstract class Board {
    int size;
    Symbol[][] gameBoard;


    public Board(int size) {
        this.size = size;
        this.gameBoard = new Symbol[size][size];
    }
}
