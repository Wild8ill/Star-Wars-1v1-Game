import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class R2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jawa extends darkSide
{
    private int direction = 0;
    int timer = 0;
    private int health = 100;
    /**
     * Act - do whatever the R2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        DeathStar world = (DeathStar)getWorld();
        moveAround();
        shootR(ionBlasterR.class);
        shootL(ionBlasterL.class);
        timer++;
        if(loseHealth(blasterR.class,blasterL.class,lightsaber.class,lightsaberL.class) == true)
        {
            health = health - 10;
            world.getRedBar().loseHp(10);
        }
        jumpJawa();
        despawn(health);
    }    

    public void moveAround()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setImage("jawaLeft.png");
            move(-5);
            direction = 1;
        }        
        if(Greenfoot.isKeyDown("d"))
        {
            setImage("jawaRight.png");
            move(5);
            direction = 0;
        }    
    }

    public void shootR(Class clss)
    {  
        if(Greenfoot.isKeyDown("s")&& timer>30 && direction == 0)
        {
            getWorld().addObject(new ionBlasterR(), getX()+30, getY());
            timer=0;
        }
    }

    public void shootL(Class clss)
    {  
        if(Greenfoot.isKeyDown("s")&& timer>30 && direction == 1)
        {
            getWorld().addObject(new ionBlasterL(), getX()-30, getY());
            timer=0;
        }
    }
}
