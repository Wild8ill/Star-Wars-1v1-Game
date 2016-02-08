import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ob1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ob1 extends lightside
{
    private int direction = 1;
    private int timer = 0;
    private int health = 100;
    /**
     * Act - do whatever the R2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            swingR(blasterR.class);
            swingL(blasterL.class);

        }
        else
        {
            moveAround("ob1left","ob1");
            if(loseHealth(ionBlasterR.class,ionBlasterL.class,saberR.class,saberL.class) == true)
            {
                health = health - 10;
            }
            despawn(health);
        }
        timer++;
    }

    public void swingR(Class clss)
    {  
        if(Greenfoot.isKeyDown("space")&& timer>30 && direction == 0)
        {
            setImage("ob1attackR.png");
            getWorld().addObject(new lightsaber(), getX(), getY());
            timer = 0;
        }
        else
        {
            if(direction==1)
            {
                setImage("ob1.png");                
            }
        }
    }

    public void swingL(Class clss)
    {  
        if(Greenfoot.isKeyDown("space")&& timer>30 && direction == 1)
        {
            setImage("ob1attackL.png");
            getWorld().addObject(new lightsaberL(), getX(), getY());
            timer=0;
        }
        
        else
        {
            if(direction==1)
            {
                setImage("ob1left.png");                
            }
        }
    }

    public void moveAround(String leftImage, String rightImage)
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage(leftImage+".png");
            move(-3);
            direction = 1;
        }        
        if(Greenfoot.isKeyDown("right"))
        {
            setImage(rightImage+".png");
            move(3);
            direction = 0;
        }
    }
}

