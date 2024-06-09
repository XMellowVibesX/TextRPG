package entities;

public class Entity {

    private int hitPoints;
    private int attackPower;
    private int defenseScore;
    private int effectCounter;
    private int gritPoints = 0;
    private String entityName;
    private static int MAX_GRIT = 3;
    
    // No-arg constructor so i can call it
    public Entity(){
        
    }
    // Constructor to be called by subclasses
    public Entity(int hp, int atk, int def, String name){
        hitPoints = hp;
        attackPower = atk;
        defenseScore = def;
        entityName = name;
    }
    
    public boolean isAlive(int HP){
        return HP > 0;
    }
    
    // Ticks down the duration of skill effects
    public void effectTick(int effect){
        effect--;
    }
    
    // If a Hero reaches MAX_GRIT, they can use their skill
    public void addGrit(int grit){
        grit++;
        if (grit > MAX_GRIT){
            grit = MAX_GRIT;
        }
    }
    
    // getters shared by all subclasses
    public int getHitPoints(){
        return hitPoints;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public int getDefenseScore(){
        return defenseScore;
    }
    public int getGritPoints(){
        return gritPoints;
    }
    public int getMaxGrit(){
        return MAX_GRIT;
    }
    public String getEntityName(){
        return entityName;
    }
    
}
