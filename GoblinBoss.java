package entities;
import java.util.Random;

public class GoblinBoss extends Entity {
// Stats (HP, ATK, DEF)
    public GoblinBoss(){
        super(20, 3, 3, "Goblin Boss");
    }

// Special Skill
    public void BrutishStrength(){
        Random dice = new Random();
        int result = dice.nextInt(2);
        switch(result){
            case 0 -> {
                attackPower++;
                effectCounter += 2;
            }
            case 1 -> { 
                defenseScore++;
                effectCounter += 2;
            }
            case 2 -> hitPoints++;
        }
        
    }

// Remove the buff
    public void endSkill(){
        if (attackPower >= 4){
            attackPower--;
        } else {
            defenseScore--;
        }
    }
   
}
