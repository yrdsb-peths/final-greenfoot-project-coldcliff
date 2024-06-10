import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World out hero lives in
 * 
 * @author Clifford 
 * @version June 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0,70);
        addObject(scoreLabel, 50, 50);
        
        spawnBanana();
    }
    
    /**
     * End the game and draw 'GameOver
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    /**
     * Inscrease score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /**
      * Create a new banana at random location at top of screen
      */ 
    public void spawnBanana()
    {
       Banana banana = new Banana();
       int x = Greenfoot.getRandomNumber(300);
       int y = 0;
       addObject(banana, 300, 0);
    }
}
