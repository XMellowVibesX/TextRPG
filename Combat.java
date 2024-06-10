package game;

/*
Generate random amount of goons (small enemies), add boss at the end
iterate through the list so i can go through each room

Using creature/entity IDs
Player - 1
Goblin - 2
Goblin Boss - 3
*/

public class Combat {

    CharacterCreation cc = new CharacterCreation();
    DiceRoller dr = new DiceRoller();
    
    private int roomNum = 0;
    
    public void entityLoader(){
        int goonCount = dr.dEight();
        int[] enemyAmount = new int[goonCount+1];
        
        for (int i = 0; i < goonCount; i++){
            enemyAmount[i] = 2;
        } enemyAmount[goonCount] = 3;
    }
    
    
    public void runCombat(){
        System.out.printf(
                "Hero   10/10   ROOM 1%n"+
                "=========================%n"+
                "* ATTACK        * FLEE%n"+
                "* STATS         * SKILL%n"+
                "=========================%n"+
                "> What will you do? (type the action you want to take)");
    }
    

    
}
