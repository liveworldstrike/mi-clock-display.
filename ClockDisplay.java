
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;
    // Permite elegir si estamos en formato 12 horas(true) o 24 horas(false)
    private boolean relojDe12Horas;
    //Guarda el dia 
    private NumberDisplay dias;
    //Guarda el año
    private NumberDisplay anos;
    //guarda el mes
    private NumberDisplay meses;

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay(boolean reloj12Horas)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dias = new NumberDisplay(31);
        anos = new NumberDisplay(99);
        meses = new NumberDisplay(13);
        dias.setValue(20);	
        anos.setValue(15);
        meses.setValue(11);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();				
    }

    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay (int horasX, int minutosX, boolean reloj12Horas,int dia,int ano,int mes)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);	
        horas.setValue(horasX);	
        minutos.setValue(minutosX);
        dias = new NumberDisplay(31);
        anos = new NumberDisplay(99);
        meses = new NumberDisplay(13);
        dias.setValue(dia);	
        anos.setValue(ano);
        meses.setValue(mes);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();    
    }

    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int horaY, int minutoY,int dia,int ano,int mes)
    {
        horas.setValue(horaY);	
        minutos.setValue(minutoY);
        dias.setValue(dia);	
        anos.setValue(ano);
        meses.setValue(mes);
        updateHoraActual();
    }

    /**
     * Devuelve la hora del reloj como una cadena de 5 caracteres
     */
    public String getTime()
    {
        return horaActual;
    }

    /**
     * Hace avanzar la hora 1 minuto
     */
    public void timeTick()
    {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
            if ( horas.getValue() == 0) {
                dias.increment();

                if ( dias.getValue() == 0) {
                    meses.increment();

                    if ( meses.getValue() == 0) {
                        anos.increment();
                        meses.increment();
                        dias.increment();
                    }
                }
            }
        }
        updateHoraActual();
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     */
    public void updateHoraActual()
    {
        if (relojDe12Horas) {
            String formato = "a.m";
            int horaAhora = horas.getValue(); 
            if (horaAhora >= 12){
                formato = "p.m.";
            }

            if (horaAhora > 12) {
                horaAhora = horaAhora - 12;
            }
            else if (horaAhora == 0) {
                horaAhora = 12;
            }
            horaActual = dias.getDisplayValue() +"/"+ meses.getDisplayValue()+"/"+ anos.getDisplayValue() +"->" + horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
        }
        else {
            horaActual = dias.getDisplayValue()+"/"+ meses.getDisplayValue()+"/"+ anos.getDisplayValue() +"->"+ horas.getDisplayValue()+ ":" + minutos.getDisplayValue();     
        }
    }

    /**
     * Método que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
        relojDe12Horas = !relojDe12Horas;
        updateHoraActual();	
    }

}
