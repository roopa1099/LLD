public abstract class Player {
    private String name;
    private Symbol playerSymbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.playerSymbol = symbol;
    }

    public String getName() {
         return name;
    }

    public Symbol getPlayerSymbol() {
        return playerSymbol;
    }
}
