import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int bananaCount= 0;
    private int speed = 2;
    public void act()
    {
         moveAndTurn();
         touch();
        
    } 
    
    public void moveAndTurn()
    {
       move (speed);
        
        if (Greenfoot. isKeyDown ("left"))
        {
              turn (-3);
        }
        if(Greenfoot. isKeyDown ("right"))
        {
              turn(3);
        } 
}   
  public void touch()
{     
         Actor banana;
         banana = getOneObjectAtOffset (0,0, banana.class);
         if (banana != null)
        {
          World world;
          world = getWorld();
          
          world.removeObject(banana);
          addScore();
        }
        Actor bomb;
        bomb=getOneObjectAtOffset (10,0, bomb.class);
         if(bomb != null)
        {
          World world;
          world = getWorld();
          Greenfoot.setWorld(new GameOver());
         
          world.removeObject(bomb);
    
        }
 }
 

 public void addScore()
{
   if (!getWorld().getObjects(Counter.class).isEmpty())
   {
        ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
        bananaCount++;
   }
   if(bananaCount == 9)
   {
       Greenfoot.setWorld(new win());
   }
}
}