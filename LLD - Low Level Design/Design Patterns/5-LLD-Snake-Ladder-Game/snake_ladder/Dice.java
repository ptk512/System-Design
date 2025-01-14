package snake_ladder;

public class Dice {
    int diceCount;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int sumDice = 0;
        int currDice = 1;
        while(currDice <= diceCount){
            int random = 1 + (int)(Math.random()*6);
            int diceNum = random;

            sumDice += diceNum;
            currDice++;
        }
        return sumDice;
    }


}
