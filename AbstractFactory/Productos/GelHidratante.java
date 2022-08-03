package AbstractFactory.Productos;

import AbstractFactory.Bases.Gel;
import AbstractFactory.Interfaces.Fabrica;
import AbstractFactory.Interfaces.IActivosProducto;
import AbstractFactory.Interfaces.IBaseProducto;
import AbstractFactory.tipoProducto.HidratenteFacial;

public class GelHidratante implements Fabrica {

    @Override
    public IBaseProducto crearBase() {
        
        return new Gel();
    }

    @Override
    public IActivosProducto adicionarActivos() {
       
        return new HidratenteFacial();
    }
    
}
