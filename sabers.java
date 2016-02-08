import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sabers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sabers extends Actor
{
    public int i = 0;
    /**
     * Act - do whatever the sabers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void swingR(String keyHeld)
    {
        if(i<23&&Greenfoot.isKeyDown(keyHeld))
        {
            turn(4);
            i++;
        }
        else
        {
            getWorld().removeObject(this);
        }        
    }
    public void swingL(String keyHeld)
    {
        if(i<23&&Greenfoot.isKeyDown(keyHeld))
        {
            turn(-4);
            i++;
        }
        else
        {
            getWorld().removeObject(this);
        }        
    }
}
