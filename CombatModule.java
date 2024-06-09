package game.systems;
import entities.*;
import java.util.Scanner;

public class CombatModule extends HeroMaker{
    private int RoundCounter = 0;
    private int RoomCounter = 0;
    private int enemyHP;
    private int enemyATK;
    private int enemyDEF;
    private int enemyGRIT;
    private String enemyNAME;
    Scanner SC = new Scanner(System.in);
    DiceRoller dr = new DiceRoller();
    PlayerActions pa = new PlayerActions();
    GameWindows gw = new GameWindows();
    HeroMaker hm = new HeroMaker();
    GoblinBoss gb = new GoblinBoss();
    Goblin g = new Goblin();
    
/*
I want there to be a random amount of small enemies per run.
Generate a random number and put that amount of
enemies in an array so I can iterate through it.
*/
    int[] enemyAmount = new int[0];
    
    public void entityLoader(){
        int minionCount = dr.dEight();
        enemyAmount = new int[minionCount+1]; // +1 is the boss at the end
        
        for (int i = 0; i < minionCount; i++){
        enemyAmount[i] = 1;} 
        enemyAmount[minionCount] = 2;
        /* Entity IDs:
        0 - Player
        1 - Goblin
        2 - Goblin Boss
        */
        
        // checking if all things have successfully loaded
        int entityCount = 0;
        for (int i : enemyAmount){
            if (i != 0){
                entityCount++;
            }
        }
        System.out.println("Loaded "+entityCount+" enemies. . .");  
        
        gw.attributesMenu(playerName, chosenHERO, playerHP, playerATK, playerDEF, playerGRIT, MAX_GRIT);
    }
    
    public void combat(){
        for (int i : enemyAmount){
            RoomCounter++;
            //Set the enemy stats for the current room
            if (i == 1){
                enemyHP = g.getHitPoints();
                enemyATK = g.getAttackPower();
                enemyDEF = g.getDefenseScore();
                enemyGRIT = g.getGritPoints();
                enemyNAME = g.getEntityName();
            } else if(i == 2){
                enemyHP = gb.getHitPoints();
                enemyATK = gb.getAttackPower();
                enemyDEF = gb.getDefenseScore();
                enemyGRIT = gb.getGritPoints();
                enemyNAME = gb.getEntityName();
            }
            
            //Calls the options menu from GameWindows 
            gw.optionsMenu(playerName, playerHP, RoomCounter);
            String choice = SC.nextLine();
            
            //Checks their respose: attack, stats, flee or skill
            switch(choice.toLowerCase()){
                case "attack" -> {
                    pa.attacking(playerATK, enemyDEF, enemyHP, enemyNAME);
                    System.out.println("GOBBO: "+enemyHP);
                    break;
                }
                case "stats" -> {
                    
                }
                
                case "skill" -> {
                    
                break;    
                }
                case "flee" -> {
                    
                    break;    
                }
            }
            
        }
        
    }
    
}
