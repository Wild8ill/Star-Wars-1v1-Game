import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blasterR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ionBlasterL extends allBlasters
{
    /**
     * Act - do whatever the blasterR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-13);
        deflect();
        despawn(ob1.class,R2.class,BB8.class);
    } 
}
