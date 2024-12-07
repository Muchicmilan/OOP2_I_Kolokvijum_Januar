package DandD;

public class Rogue extends Character {
    private static final TestHitDice rollForHp = new TestHitDice(1,8);

    Rogue(String name, int initiative) {
        super(name, initiative, rollForHp.rollDice());
    }
}
