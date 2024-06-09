
package main.game;
import game.systems.*;

import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        CombatModule cm = new CombatModule();
        GameWindows gw = new GameWindows();
        HeroMaker hm = new HeroMaker();
        
        hm.askPlayerName();
        //gw.introDialogue(hm.getPlayerName());
        //gw.titleScreen();
        hm.heroSelect();
        cm.entityLoader();
        cm.combat();
    }
    
}
