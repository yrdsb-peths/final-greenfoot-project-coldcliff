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
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    // Direction the elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created
     */
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100, 90);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
           idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
           idleLeft[i].mirrorHorizontally();
           idleLeft[i].scale(100, 90);
        }
        
        animationTimer.mark();
        
        // Inital elephant image
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the elephant 
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
        
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    
    }
    
    public void act()
    {
       if(Greenfoot.isKeyDown("left"))
       {
           move(-2);
           facing = "left";
       }
       else if(Greenfoot.isKeyDown("right"))
       {
           move(2);
           facing = "right";
       }
       // Remove banana if elephant eats it
       eat();
       
       //Animate the elephant
       animateElephant();
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
            elephantSound.play();
        }
    }
}
