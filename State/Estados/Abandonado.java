package State.Estados;

import State.Carrito;
import State.Estado;

public class Abandonado implements Estado
{
    private Carrito T;

    public Abandonado (Carrito T)
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
        System.out.println("Carrito a Prefactura");
        
    }

    @Override
    public void Overtime() {
        System.out.println("CarritoEliminado");
        
    }
    
}
