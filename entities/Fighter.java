package entities;

public class Fighter extends Entity {
    
// Stats (HP, ATK, DEF)
    public Fighter(){
        super(10, 3, 1, "Fighter");
    }

// Special Skill
    public void FightingSpirit(){
        System.out.printf(
                "* You feel your strength grow from within!%n"+
                "* You channeled your FIGHTING SPIRIT!%n"+
                "+1 to ATK%n"+
                "+1 to DEF%n"+
                "(Lasts for 2 turns)");
        attackPower++;
        defenseScore++;
        effectCounter = 2;
    }

// Remove the buff
    public void endSkill(){
        attackPower--;
        defenseScore--;
    }
}
