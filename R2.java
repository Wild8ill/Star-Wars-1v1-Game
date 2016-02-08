import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class R2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R2 extends lightside
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
        DeathStar world = (DeathStar)getWorld();
        moveAround("R2left","R2right");
        shootR(blasterR.class);
        shootL(blasterL.class);
        timer++;
        if(loseHealth(ionBlasterR.class,ionBlasterL.class,saberR.class,saberL.class) == true)
        {
            health = health - 10;
            world.getBlueBar().loseHp(10);
        }
        jumpDroid(direction,"R2left","R2right");
        despawn(health);
    }       

    public void shootR(Class clss)
    {  
        if(Greenfoot.isKeyDown("down")&& timer>30 && direction == 0)
        {
            getWorld().addObject(new blasterR(), getX()+ 30, getY());
            timer=0;
        }
    }

    public void shootL(Class clss)
    {  
        if(Greenfoot.isKeyDown("down")&& timer>30 && direction == 1)
        {
            getWorld().addObject(new blasterL(), getX() - 30, getY());
            timer=0;
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
