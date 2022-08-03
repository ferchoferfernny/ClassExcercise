package State.Estados;


import State.Estado;

public class Entregado implements Estado {

    
    @Override
    public void Overtime() {
        System.out.println("Accion no Validad");
        
    }

    @Override
    public void Facturado() {
        System.out.println("Compra ejecutada ");
        
    }

    @Override
    public void Cancelado() {
        System.out.println("Accion no Validad");
    }
    
}
