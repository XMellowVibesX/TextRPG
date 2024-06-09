package game.systems;
import java.util.Random;

/* 
The idea is to have a method that checks dice rolls
so i can keep calling it if need be, might implement
comparing the dice to Defense or Evasion numbers in the
future
*/

public class DiceRoller {
    Random d = new Random();
    String atkResult;
    String fleeResult;
    
    public int dSix(){
        int dice = d.nextInt(6)+1;
        return dice;
    }
    
    public int dEight(){
        int dice = d.nextInt(8)+1;
        return dice;
    }
    
    public void attackRoll(int r){
        if (r <= 2){
            atkResult = "fail";
        } else if (r >= 3 && r <=5){
            atkResult = "success";
        } else if (r == 6){
            atkResult = "crit";
        }
    }
    
    public void fleeRoll(int r){
        if (r <= 3){
            fleeResult = "fail";
        } else if (r >= 4) {
            fleeResult = "succeed";
        }
    }
    
    public String getAttackResult(){
        return atkResult;
    }
    
    public String getFleeResult(){
        return fleeResult;
    }
}
   
   

