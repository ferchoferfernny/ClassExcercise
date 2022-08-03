package AbstractFactory.Bases;

import AbstractFactory.Interfaces.IBaseProducto;

public class Emulsion implements IBaseProducto {

    @Override
    public void faseAcuosa() {
        
        System.out.println(" Se adciona Agua y un Agente Coloidal");
        
    }

    @Override
    public void faseOleosa() {
        System.out.println(" Se debe cremar los diferentes lipidos de la mezcla");
        
    }

    
    
}
