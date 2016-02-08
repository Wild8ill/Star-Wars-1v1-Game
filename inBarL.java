import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inBarL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inBarL extends health
{
    int hp = 100;
    int newHp = 100;
    /**
     * Act - do whatever the inBarR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(hp>newHp)
        {
            move(-2);
            hp--;            
        }
    }    
    public void loseHp(int loss)
    {
        newHp = newHp - loss;
    }
      
}
