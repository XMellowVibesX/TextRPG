package game.systems;
import java.util.Scanner;
import entities.*;

public class PlayerActions {
    Entity e = new Entity();
    Goblin g = new Goblin();
    DiceRoller dr = new DiceRoller();
    
    public void attacking(int attack, int targetDEF, int targetHP, String target){
        int r = dr.dSix();
        System.out.println("...You rolled a "+r);
        
        dr.attackRoll(r);
        switch(dr.atkResult){
            case "fail" -> {
                System.out.println("MISSED!");
                break;
            }
            case "success" -> {
                System.out.println("HIT!");
                
                int totalDMG = attack - targetDEF;
                targetHP -= totalDMG;
                System.out.println(target+"took "+totalDMG+" damage!");
                break;
            }
            case "crit" -> {
                System.out.println("CRITICAL HIT!");
                
                int totalDMG = (attack*2) - targetDEF;
                targetHP -= totalDMG;
                System.out.println(target+"took "+totalDMG+" damage!");
                break;
            }
        }
    }
    
    public void stats(){
        
    }
}
