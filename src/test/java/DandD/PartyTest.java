package DandD;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartyTest {
    @Test
    public void shouldCheckIfCharacterCreationIsValid(){
        Warrior warrior = new Warrior("warrior",2);
        Wizard wizard = new Wizard("wizard",1);
        Rogue rogue = new Rogue("rogue", 0);
        Warrior warrior2 = new Warrior("warrior",3);

        int expectedWarriorHp = 1;
        int expectedWizardHp = 2;
        int expectedRogueHp = 3;
        int expectedWarrior2Hp = 4;

        Assertions.assertThat(warrior.getMaxHitPoints()).isEqualTo(expectedWarriorHp);
        Assertions.assertThat(wizard.getMaxHitPoints()).isEqualTo(expectedWizardHp);
        Assertions.assertThat(rogue.getMaxHitPoints()).isEqualTo(expectedRogueHp);
        Assertions.assertThat(warrior2.getMaxHitPoints()).isEqualTo(expectedWarrior2Hp);
    }
    @Test
    public void shouldCheckIfPartyIsValid(){
        Warrior warrior = new Warrior("warrior",2);
        Wizard wizard = new Wizard("wizard",1);
        Rogue rogue = new Rogue("rogue", 0);
        Warrior warrior2 = new Warrior("warrior",3);
        List<Character> party1 = new ArrayList<>();
        party1.add(warrior);
        party1.add(rogue);
        List<Character> party2 = new ArrayList<>();
        party2.add(warrior2);
        party2.add(rogue);
        party2.add(wizard);
        Party party = new Party(party1);
        Party party3 = new Party(party2);
        Assertions.assertThat(party.isValid()).isFalse();
        Assertions.assertThat(party3.isValid()).isTrue();
    }

}