package AbstractFactory.Interfaces;

public interface Fabrica {
    
    IBaseProducto crearBase();

    IActivosProducto adicionarActivos();
}

