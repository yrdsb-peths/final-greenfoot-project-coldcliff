import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Clifford
 * @version March 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getHeight()/2, 88);
        prepare();
    }
    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is :Create the initial objects and add them to the world.
     */
    private void prepare()
    {
         Elephant elephant = new Elephant();
        addObject(elephant,getWidth()/2,getHeight()/2);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,333,345);
        Label label2 = new Label("Use \u2190 & \u2192 to Move", 40);
        addObject(label2,getWidth()/2,300);
    }
}


