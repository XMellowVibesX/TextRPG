package entities;

public class Paladin extends Entity {
// Stats (HP, ATK, DEF)
    public Paladin(){
        super(12, 2, 3, "Paladin");
    }

// Special Skill
    public void HolyLight(){
        System.out.printf(
                "* Your faith pushes you forward! Your devoition, unmatched!%n"+
                "* You are blessed with HOLY LIGHT!%n"+
                "+1 HP%n"+
                "(Instant regen)"
        );
        hitPoints++;
    }
}
