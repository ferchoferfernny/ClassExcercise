package State.Estados;

import State.Carrito;
import State.Estado;

public class Prefactura implements Estado {


    private Carrito T;

    public Prefactura (Carrito T)
    {
        this.T=T; 
    }

    @Override
    public void Overtime() {

        T.setActual(new Abandonado( T));
        System.out.println("Carrito Abandonado");
        
    }

    @Override
    public void Facturado() {
        T.setActual(new Entregado());
        System.out.println("Compra concluidada");
        
    }

    @Override
    public void Cancelado() {
        System.out.println("CarritoEliminado");
        
    }
    
}
