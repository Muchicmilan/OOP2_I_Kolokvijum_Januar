package DandD;

public class Warrior extends Character{
    private static final TestHitDice rollForHp = new TestHitDice(1,10);

    Warrior(String name, int initiative) {
        super(name, initiative, rollForHp.rollDice());
    }
}
