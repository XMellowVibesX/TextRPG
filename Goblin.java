package entities;

public class Goblin extends Entity {
// Stats (HP, ATK, DEF)
    public Goblin(){
        super(7, 3, 1, "Goblin");
    }

// Special Skill
    public void Evade(){
        defenseScore++;
        effectCounter += 2;
    }

// Remove the buff    
    public void endSkill(){
        defenseScore--;
    }
}
