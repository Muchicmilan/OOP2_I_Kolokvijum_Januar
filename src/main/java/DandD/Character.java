package DandD;

import lombok.Getter;

@Getter
public abstract class Character {
    String name;
    TestHitDice hitDice;
    int maxHitPoints;
    int currentHitPoints;
    int experience;
    int level;
    int initiative;

    Character(String name,int initiative,int maxHitPoints){
        this.name = name;
        this.initiative = initiative;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = maxHitPoints;
        this.experience = 0;
        this.level = 1;
    }
}
