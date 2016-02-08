import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lightside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lightside extends Actor
{
    int speed = 0;
    int time = 100;
    int upSpeed = 10;
    /**
     * Act - do whatever the lightside wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

    public boolean loseHealth(Class enemyWeapon,Class enemyWeapon2,Class enemyWeapon3,Class enemyWeapon4)
    {
        if(!getObjectsInRange(60,enemyWeapon).isEmpty()||!getObjectsInRange(60,enemyWeapon2).isEmpty()||!getObjectsInRange(60,enemyWeapon3).isEmpty()||!getObjectsInRange(60,enemyWeapon4).isEmpty())
        {
            return true;
        }
        else
        {
            return false;            
        }
    }

    public void despawn(Integer Health)
    {
        if(Health <= 0)
        {
            getWorld().removeObject(this);            
        }
    }

    public void jumpDroid(int direction,String left,String right)
    {
        if(Greenfoot.isKeyDown("up")&&time>0)
        {
            if(direction == 1)
            {
                setImage("R2lefthover.png");
            }
            else 
            {
                setImage("R2righthover.png");              
            }
            setRotation(270);
            move(upSpeed/10);
            setRotation(0);
            speed = 0;
            upSpeed++;
            time--;
        }
        else if(getY()<520)
        {
            setRotation(90);
            move(speed/10);
            setRotation(0);
            upSpeed=10;
            if(getY()<510)
            {
                speed = speed + 3;
            }
            else
            {
                speed = 40 ; 
            }
        }
        if(getY()>=520)
        {
            time = 100;
            if(direction == 1)
            {
                setImage(left+".png");                
            }
            else
            {
                setImage(right+".png");
            }
            speed = 0;
        }
    }
}
