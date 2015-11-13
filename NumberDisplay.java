
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limitNumber;
    private int display;
    

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limitNumber1)
    {
       display = 0;
       limitNumber = limitNumber1;
    }

    public void setValue(int display1)
    {
        display = display1;
        
    }
    
    public String getDisplayValue()
    {
        String displayY = "%02d";
        String result = String.format(displayY,display);
        return result;
    }
    
    public int getValue()
    {
        return display;
    }
    
    public void increment()
    {
        if (display == limitNumber)
        {
            display = 0;
        }
        else {
            display++;
        }
    }
       
        
    }
    

