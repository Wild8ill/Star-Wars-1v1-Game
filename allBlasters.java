import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class allBlasters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class allBlasters extends Actor
{
    /**
     * Act - do whatever the allBlasters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

    public boolean atWorldEdge()
    {
        if(getX() < 5 || getX() > getWorld().getWidth() - 5)
            return true;
        if(getY() < 5 || getY() > getWorld().getHeight() - 5)
            return true;
        else
            return false;
    }

    public void despawn(Class enemy , Class enemy2 , Class enemy3)
    {
        if (atWorldEdge()||getObjectsInRange(50,enemy).isEmpty() == false||getObjectsInRange(50,enemy2).isEmpty() == false||getObjectsInRange(50,enemy3).isEmpty() == false)
        {
            getWorld().removeObject(this);            
        }        
    }
    public void deflect()
    {
        if(!getObjectsInRange(12,ionBlasterL.class).isEmpty()||!getObjectsInRange(12,ionBlasterR.class).isEmpty()||!getObjectsInRange(12,blasterL.class).isEmpty()||!getObjectsInRange(12,blasterR.class).isEmpty()) 
        {
            setRotation(Greenfoot.getRandomNumber(90)-45);            
        }
        else if (!getObjectsInRange(50,saberL.class).isEmpty()||!getObjectsInRange(50,saberR.class).isEmpty()||!getObjectsInRange(50,lightsaber.class).isEmpty())
        {
            setRotation(180);           
        }
    }
}
