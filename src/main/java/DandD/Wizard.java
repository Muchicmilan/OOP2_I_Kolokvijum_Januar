package DandD;

public class Wizard extends Character{
    final private static TestHitDice rollForHp = new TestHitDice(1,6);
    Wizard(String name, int initiative) {
        super(name, initiative, rollForHp.rollDice());
    }
}
