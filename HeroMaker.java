package game.systems;
import java.util.Scanner;
import entities.*;

/*
Here, the player picks their class and where I lock in their stats
Since the Entity is the blueprint for ALL entities, this class is where
we distinguish the player's stats, from the enemies.

the idea is to have the various entity (hero) subclasses import their stats here,
depending on what the player chooses
*/
public class HeroMaker {   
    
    // OBJECTS
    Scanner SC = new Scanner(System.in);
    GameWindows gw = new GameWindows();
    Entity e = new Entity();
    Fighter f = new Fighter();
    Paladin p = new Paladin();
    Wizard w = new Wizard();
    
    // variables to set player stats
    protected int playerHP;
    protected int playerATK;
    protected int playerDEF;
    protected String chosenHERO;
    protected String playerName;
    protected int playerGRIT = e.getGritPoints();
    protected int MAX_GRIT = e.getMaxGrit();
    
    public void askPlayerName(){
        System.out.printf("GREETING'S ADVENTURER!%n"+
                "%n"+
                "What's your name?%n"+
                "> ");
        playerName = SC.nextLine();        
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public void heroSelect() throws InterruptedException{
        // the player sees the hero options
        System.out.println("CHOOSE YOUR CLASS! (type the class you want to play)");
        Thread.sleep(500);
        gw.heroSelectScreen();
        
        // Input field
        System.out.print("> ");
        String choice = SC.nextLine();
        
        // Checking player choice
        makingHero(choice);
        }
    
    public void makingHero(String choice){
        
        switch(choice.toLowerCase()){
            
            case "fighter" -> {
                playerHP = f.getHitPoints();
                playerATK = f.getAttackPower();
                playerDEF = f.getDefenseScore();
                chosenHERO = f.getEntityName();
                break;
            }
            case "paladin" -> {
                playerHP = p.getHitPoints();
                playerATK = p.getAttackPower();
                playerDEF = p.getDefenseScore();
                chosenHERO = p.getEntityName();
                break;
            }
            case "wizard" -> {
                playerHP = w.getHitPoints();
                playerATK = w.getAttackPower();
                playerDEF = w.getDefenseScore();
                chosenHERO = w.getEntityName();
                break;
            }
            default -> System.out.println("Invalid choice, please select a valid Hero.");
        }
    }
}