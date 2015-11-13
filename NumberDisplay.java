
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limitNumbre;
    private int display;
    private int display1;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limitNumber,int display2)
    {
       display = 0;
       display1 = display2;
    }

    public void setValue()
    {
        display = display1;
    }
    
    public String getDisplayValue()
    {
        String displayY = "%02d";
        String result = String.format(displayY,display);
        return resultado;
    }
    
    public int getValue()
    {}
    
}
