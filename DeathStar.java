import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VikramWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathStar extends World
{
    inBarR blueBar;
    inBarL redBar;

    /**
     * Constructor for objects of class VikramWorld.
     * 
     */
    public DeathStar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        blueBar = new inBarR();
        addObject(blueBar, 607, 100);
        redBar = new inBarL();
        addObject(redBar, 193, 100);
    }

    public inBarL getRedBar()
    {
        return redBar;        
    }  

    public inBarR getBlueBar()
    {
        return blueBar;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        R2 r2 = new R2();
        addObject(r2, 650, 520);
        jawa jawa1 = new jawa();
        addObject(jawa1, 150, 520);
        barR barr = new barR();
        addObject(barr, 700, 100);
        barL barl = new barL();
        addObject(barl, 100, 100);

    }
}
