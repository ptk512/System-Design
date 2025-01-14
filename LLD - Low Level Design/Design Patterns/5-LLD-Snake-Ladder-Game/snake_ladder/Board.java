package snake_ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cells[][] cells;

    public Board(int boardSize, int numOfSnakes, int numOfLadder){

        intializeCells(boardSize);
        addSnakesLadders(numOfSnakes, numOfLadder);

    }
    private void intializeCells(int boardSize){
        cells = new Cells[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Cells cellObj = new Cells();
                cells[i][j] = cellObj;
            }

        }
    }

    private void addSnakesLadders(int numOfSnakes, int numOfLadders){
        /**Add snakes*/
        while (numOfSnakes > 0){
            //get random number from 1 to 99
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);

            if(snakeHead <= snakeTail){
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cells cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numOfSnakes--;
        }

        /**Add Ladders*/
        while (numOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);

            if(ladderStart >= ladderEnd){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cells cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numOfLadders--;
        }

    }

    Cells getCell(int playerPosition){
        int boardRow = playerPosition / cells.length;
        int boardCol = playerPosition % cells.length;
        return cells[boardRow][boardCol];
    }
}
