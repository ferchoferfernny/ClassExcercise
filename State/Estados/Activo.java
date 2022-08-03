package State.Estados;

import State.Carrito;
import State.Estado;

public class Activo implements Estado {

    private Carrito T;

    public Activo ()
    {
     
    }
    public Activo (Carrito T)
    {
        this.T=T; 
    }
    @Override
    public void Cancelado() {
        System.out.println("Carrito Elminado");
    }

    @Override
    public void Facturado() {
        T.setActual(new Prefactura(T));
        System.out.println("Carrito a prefactura ");
        
    }

    @Override
    public void Overtime() {
        T.setActual(new Abandonado( T));
        System.out.println("Carrito Abandonado");
        
    }
    
}
