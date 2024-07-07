public enum SymbolType{
    X;
    O;
}

public abstract class Symbol {
    SymbolType symbol;

    public Symbol(SymbolType symbol) {
        this.symbol = symbol;
    }

    public getSymbol() {
        return symbol;
    }
}

public class SymbolX extends Symbol{
    public SymbolX() {
        super(SymbolType.X);
    }
}


public class SymbolO extends Symbol{
    public SymbolO() {
        super(SymbolType.O);
    }
}