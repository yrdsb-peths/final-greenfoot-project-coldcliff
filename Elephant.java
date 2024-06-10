import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Clifford 
 * @version June 2024
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(Greenfoot.isKeyDown("left"))
       {
           move(-1);
       }
       else if(Greenfoot.isKeyDown("right"))
       {
           move(1);
       }
       // Remove banana if elephant eats it
       eat();
    }
    
    /**
     * Eat the banana and spawn new banana if a banana is eaten
     */
    public void eat()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnBanana();
            world.increaseScore();
        }
    }
}