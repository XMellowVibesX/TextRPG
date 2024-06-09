package entities; 

public class Wizard extends Entity {

// Stats (HP, ATK, DEF)
    public Wizard(){
        super(8, 5, 0, "Wizard");
    }
    
// Special skill
    public void Fireball(){
        System.out.printf(
                "* You gather your magic for one devastating strike!%n"+
                "* You cast FIREBALL!%n"+
                "(Your next attack now deals double damage)"
        );
        attackPower *= 2;
        effectCounter++;
    }
}
