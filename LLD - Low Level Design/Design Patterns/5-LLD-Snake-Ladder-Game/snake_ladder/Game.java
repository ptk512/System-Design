package snake_ladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPLayers();
    }

    private void addPLayers(){
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame(){
        System.out.println("starting game");
        while(winner == null){
            //check whose turn is
            Player playerTurn = findPlayerTurn();
            System.out.println("Player turn is: " + playerTurn.id + " current position is: "+playerTurn.currentPosition);

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the newPosition after dice roll
            int playerNewPosition = playerTurn.currentPosition + diceNumbers;
            //check for snake & ladder at newPosition
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("player turn is: " + playerTurn.id + " new position is: "+playerNewPosition);

            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length - 1){
                winner = playerTurn;
            }

        }

        System.out.println("WINNER IS: " + winner.id);

    }

    private Player findPlayerTurn(){
        //Deque ka use -> front vale ka turn hoga fr front ko nikal ke last me add kr do to 2nd player front par aa jaenga
        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck(int playerNewPosition){
        if(playerNewPosition > board.cells.length * board.cells.length - 1){
            return playerNewPosition;
        }

        Cells cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition){
            String jumpBy = (cell.jump.start < cell.jump.end) ? "ladder" : "snake"; //just to print
            System.out.println("jump done by: " + jumpBy + " present at position: "+playerNewPosition);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

}
