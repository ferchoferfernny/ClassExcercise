package AbstractFactory.tipoProducto;

import AbstractFactory.Interfaces.IActivosProducto;

public class HidratenteFacial implements IActivosProducto{

    @Override
    public void adicionActivos() {
        System.out.println("Conjunto de activos que componen un sistema Hidratante");
        
    }
     
}
