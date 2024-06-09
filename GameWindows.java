package game.systems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Most, if not all, "GUI" elements and "screens" happen here, I wanted to put all 
the code that doesn't run the core gameplay (cosmetic/aesthetic) in 1 place
*/

public class GameWindows {
    
    Scanner SC = new Scanner(System.in);
    
    public void introDialogue(String name) {
        // Opening monologue
        // credits: Kuya Rov for help with the file readers
	
        System.out.printf("%n"+
                "[Katherine] Ah! "+name+", it's good to see you again!%n"+
                "Here for another quest, I see? Well,%n"+
                "we got a new request for your guild rank!%n");
        
	String introText1 = "C:\\Users\\user\\Documents\\NetBeansProjects\\TextRPG\\src\\exposition.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(introText1))) {
            String lines;
            // Read each line from the file until reaching the end
            while ((lines = reader.readLine()) != null) {
                // Print each line and accept Enter to move to next line
                System.out.print(lines);
                SC.nextLine();
            }
        } catch (IOException e) {
            // Handle file reading errors
            e.printStackTrace();
        }
    }
    
// GOBLIN DEEZ NUTZ . . . HA!
    
    public void titleScreen() throws InterruptedException{
        String[] titleText = {"==================================================",
        " ","      !!!     GOBLIN GUTZ & GLORY     !!!"," ",
        "==================================================",
        "             PRESS [ENTER] TO START     "};
        for (String i : titleText){
            System.out.println(i);
            Thread.sleep(700);
        }
        SC.nextLine();
    }
        
    public void heroSelectScreen(){
        
        //Fighter stats
        System.out.printf(
                "=========================%n"+
                        "FIGHTER%n"+
                        "[ HP: 10  |  ATK: 3  |  DEF: 1 ]%n"+
                        "Skill: FIGHTING SPIRIT %n"+
                        "Buff yourself, gaining +1 ATK and +1 DEF,%n"+
                        "lasting for 2 turns.%n"+
                        "%n");
        // Paladin stats
        System.out.printf(
                        "PALADIN%n"+
                        "[ HP: 12  |  ATK: 2  |  DEF: 2 ]%n"+
                        "Skill: HOLY LIGHT %n"+
                        "Instantly heal yourself for 1 HP.%n"+
                        "%n");
        // Wizard stats
        System.out.printf(
                        "WIZARD%n"+
                        "[ HP: 8  |  ATK: 5  |  DEF: 0 ]%n"+
                        "Skill: FIREBALL %n"+
                        "Buff yourself DOUBLING your ATK,%n"+
                        "lasting until the end of your %n"+
                        "current turn.%n"+
                        "=========================%n");
    }
    
    public void optionsMenu(String name, int HP, int ROOM){
        System.out.printf(
                name+"   HP: "+HP+"   ROOM "+ROOM+"%n"+
                "=========================%n"+
                "* ATTACK        * FLEE%n"+
                "* STATS         * SKILL%n"+
                "=========================%n"+
                "What will you do? (type the action you want to take)%n"+
                "> "
        );
    }
    
    public void attributesMenu(String name, String HERO, int HP, int ATK, int DEF, int GRIT, int MAXGRIT){
        System.out.printf(
                name+"%n"+
                "=========================%n"+
                "HP: "+HP+"      DEF: "+DEF+"%n"+
                "ATK: "+ATK+"     GRIT: "+GRIT+" / "+MAXGRIT+"%n"+
                "CLASS: "+HERO+"%n"+
                "=========================%n"+
                "Type 'opt' to return to options%n"+
                "> ");
    }
    
}
