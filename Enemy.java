import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    // Add imageCounter variable here
    private int imageCounter = 3;
    /**
     * Rescales Enemy picture to proper scale.
     * @param There are no parameters
     * @return Nothing is returned
     */
    // Add Enemy constructor here to scale the image for the Enemy
    public Enemy ()
    {
        getImage().scale(25, 25);
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add code to have enemy move left here
        move(-2);
        
        /**
         * Check if imageCounter is >= 3. If so, mirror the image horizontally and
         * set imageCounter to 0. Otherwise, increase the imageCounter by 1.
         */
        if(imageCounter >=3)
        {
            getImage().mirrorHorizontally();
            imageCounter = 0;
        }
        else
        {
            imageCounter ++;
        }
        
        //Check if the Enemy's x location is <= 0. If so, remove it from the world
        if (getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
