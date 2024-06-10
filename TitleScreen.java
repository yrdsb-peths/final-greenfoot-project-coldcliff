import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        
        addObject(titleLabel, getHeight()/2, 200);
        prepare();
    }
    /**
     * The main world act loop
     */
    public void act()
    {
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
        addObject(elephant,479,87);
        elephant.setLocation(494,120);
        Label label = new Label("Use \u2190 and \2192 to Move", 40);
        addObject(label,220,257);
        label.setLocation(305,205);
        label.setLocation(299,235);
        Label label2 = new Label("Press<space> to start", 40);
        addObject(label2,250,246);
        label2.setLocation(300,200);
        label.setLocation(327,256);
        label2.setLocation(290,392);
        label.setLocation(289,255);
    }
}


