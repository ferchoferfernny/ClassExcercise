package AbstractFactory.Productos;

import AbstractFactory.Bases.Locion;
import AbstractFactory.Interfaces.Fabrica;
import AbstractFactory.Interfaces.IActivosProducto;
import AbstractFactory.Interfaces.IBaseProducto;
import AbstractFactory.tipoProducto.ContornoOjos;

public class LocionOjos implements Fabrica{

    @Override
    public IBaseProducto crearBase() {
        
        return new Locion();
    }

    @Override
    public IActivosProducto adicionarActivos() {
       
        return new ContornoOjos();
    }

}