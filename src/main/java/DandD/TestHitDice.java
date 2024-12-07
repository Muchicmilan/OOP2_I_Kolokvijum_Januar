package DandD;

public class TestHitDice {
    private static int currentCount =1;
    private final int diceCount;
    private final int sidesCount;

    TestHitDice(int diceCount, int sidesCount) {
        this.diceCount = diceCount;
        this.sidesCount = sidesCount;
    }

    public int rollDice(){
        if(currentCount > sidesCount )
            currentCount = 1;
        int roll = diceCount * currentCount;
        currentCount++;
        return roll;
    }
}
