package DandD;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor

public class Party {
    private List<Character> party;

    public void addToParty(Character character) {
        party.add(character);
    }

    public boolean isValid(){
        boolean hasWizard = false;
        boolean hasRogue = false;
        boolean hasWarrior = false;
        for(Character c : party){
            if(c.getClass() == Wizard.class)
                hasWizard = true;
            else if(c.getClass() == Rogue.class)
                hasRogue = true;
            else if (c.getClass() == Warrior.class)
                hasWarrior = true;
            if(hasWarrior && hasRogue && hasWizard)
                return true;
        }
        return false;
    }

}
