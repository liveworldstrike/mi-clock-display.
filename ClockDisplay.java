
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
    //tipo de horas
    private boolean tipos;
    
    

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(boolean tipos1)
    {
      //iniciar horas y minutos
     horas = new NumberDisplay(24);
     minutos = new NumberDisplay(59);
     updateDisplay();
     tipos = tipos1;

    }
    
    /**
     * Segundo Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(int hora,int minuto,boolean tipos1)
    {
      //dar minutos y horas
     horas = new NumberDisplay(24);
     minutos = new NumberDisplay(59);
     setTime(hora,minuto);
     tipos = tipos1;
    }
    
     /**
     * actualizar hora del display
     */
    public void updateDisplay()
    {
        if (tipos == true){
        if(horas.getValue() >12){
            
            int hora = horas.getValue()-12;
            horaActual = hora +":"+ minutos.getDisplayValue()+ "PM";
            
        }
        else{
            
           horaActual = horas.getDisplayValue()+":"+ minutos.getDisplayValue()+ "AM";
            
        }
    }
        else{
            horaActual = horas.getDisplayValue()+":"+ minutos.getDisplayValue();
    }
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
     * avanzar un minuto
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
