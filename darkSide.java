import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class darkSide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class darkSide extends Actor
{
    int speed = 0;
    int time = 50;
    int upSpeed = 70;
    /**
     * Act - do whatever the darkSide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    } 

    public boolean loseHealth(Class enemyWeapon,Class enemyWeapon2,Class enemyWeapon3,Class enemyWeapon4)
    {
        if(!getObjectsInRange(60,enemyWeapon).isEmpty()||!getObjectsInRange(60,enemyWeapon2).isEmpty()||!getObjectsInRange(120,enemyWeapon3).isEmpty()||!getObjectsInRange(120,enemyWeapon4).isEmpty())
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
        if(Health == 0)
        {
            getWorld().removeObject(this);            
        }
    }

    public void jump()
    {
        if(Greenfoot.isKeyDown("w")&&time>0)
        {
            setRotation(270);
            move((getY()-190)/25);
            setRotation(0);
            time--;
        }
        else if(getY()<520)
        {
            setRotation(90);
            move(speed/10);
            setRotation(0);
            speed= speed +3;
        }
        if(getY()>=520)
        {
            time = 50;            
        }
    }
    public void jumpJawa()
    {
        if(Greenfoot.isKeyDown("w")&&time>0)
        {
            setRotation(270);
            move(upSpeed/10);
            setRotation(0);
            upSpeed--;
            time--;
        }            
        
        else if(getY()<520)
        {
            setRotation(90);
            move(speed/10);
            setRotation(0);
            upSpeed = 70;
            time = 0;
            if(getY()<510)
            {
                speed++;
            }
            else
            {
                speed = 40 ; 
            }
        }
        if(getY()>=520)
        {
            time = 50;
            speed = 10;
        }
    }
}        

