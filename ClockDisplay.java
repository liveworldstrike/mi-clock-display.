
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // horas a las que poner
    private NumberDisplay horas;
    //minutos a los que poner
    private NumberDisplay minutos;
    //hora actual
    private String horaActual;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
      //iniciar horas y minutos
     horas = new NumberDisplay(24);
     minutos = new NumberDisplay(60);
     updateDisplay();

    }
    
    /**
     * actualizar hora 
     */
    public void updateDisplay()
    {
      horaActual = horas.getDisplayValue()+":"+ minutos.getDisplayValue();
    }
    
     /**
     * Segundo Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(int hora,int minuto)
    {
      //iniciar horas y minutos
     horas = new NumberDisplay(24);
     minutos = new NumberDisplay(60);
     setTime(hora,minuto);
    }
    
    /**
     * devolver hora 5 caracteres
     */
    public String getTime()
    {
        return horaActual;
    }
    
    /**
     * fijar horas y minutos
     */
    public void setTime(int hora,int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        updateDisplay();
    }
    
    /**
     * avanzar un minto
     */
    public void timeTick()
    {
        minutos.increment();
        if(minutos.getValue() == 0) {
            horas.increment();
        }
        updateDisplay();
    }


  
}
