import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        banana banana = new banana();
        addObject(banana,146,195);
        banana banana2 = new banana();
        addObject(banana2,48,62);
        banana banana3 = new banana();
        addObject(banana3,269,88);
        banana banana4 = new banana();
        addObject(banana4,330,238);
        banana banana5 = new banana();
        addObject(banana5,488,71);
        banana banana6 = new banana();
        addObject(banana6,536,193);
        banana banana7 = new banana();
        addObject(banana7,164,30);
        banana3.setLocation(252,131);
        banana5.setLocation(520,47);
        banana banana8 = new banana();
        addObject(banana8,390,47);
        Counter counter = new Counter();
        addObject(counter,55,362);
        turtle turtle = new turtle();
        addObject(turtle,318,362);
        removeObject(counter);
        banana2.setLocation(436,158);
        turtle.setLocation(37,50);
        banana6.setLocation(490,292);
        banana banana9 = new banana();
        addObject(banana9,225,340);

        addObject(counter,56,364);
        bomb bomb = new bomb();
        addObject(bomb,187,280);
        bomb bomb2 = new bomb();
        addObject(bomb2,544,152);
        bomb bomb3 = new bomb();
        addObject(bomb3,441,364);
        bomb bomb4 = new bomb();
        addObject(bomb4,316,32);
    }
}
