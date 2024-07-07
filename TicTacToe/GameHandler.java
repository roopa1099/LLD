public interface IGameHandler {
    void startGame(Queue<Player> queue);
    void addPiece(SymbolType symbol);
    String declareWinner(String name)
}

public class GameHandler implements IGameHandler {
    List<Player> players = new ArrayList<>();
    Board board;
    Scanner sc = new Scanner(System.in);

    void initialize() {

        Player player1 = sc.next();
        Player player2 = sc.next();

        players.add(player1);   
        players.add(player2);   
        
        int size = sc.nextInt();
        board = new Board(size);

        for(int i=0;i<size;i++){
            for(int i=0;i<size;i++){
                board[i][j] = null;
            }
        }

        for(Player player : players) {
            queue.add(player);
        }
        startGame(queue);
    }

    @Override
    void startGame(Queue<Player> queue) {
        while(!queue.isEmpty()){
            Player current = queue.peek();
            System.out.println("Enter index x and y: ");
            int x=sc.nextInt();
            int y=sc.nextInt();
    
            if(x>=0 && x<size && y>=0 && y<size && board[x][y]!=null){
                System.out.println("Invalid position!! Try again");
                continue;
            }
            addPiece(current.getPlayerSymbol(),x,y);
    
            if(validatePosition()) {
                declareWinner(current.getName());
                break;
            }
            queue.remove();
            queue.add(current);
        }

    }


    @Override
    void addPiece(SymbolType symbol, int x, int y) {
        board[x][y] = symbol
    }

    @Override
    String declareWinner(String name) {

    }

    boolean validatePosition(){
        return true;
    }
}
