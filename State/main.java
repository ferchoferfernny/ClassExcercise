package State;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Producto perro =new Producto("Pastor", 1, 300000, "muy lindo");
        Producto gato =new Producto("Perso", 2, 20000, "muy feo");

        ArrayList <Producto> compra1= new ArrayList<>();

        compra1.add(perro);
        compra1.add(gato);

        Carrito miCompra = new Carrito(compra1);

        //Empieza la ejecución de los estados apenas se crea al carrito a medida que exita un metodos de compraración de tiempo

        

    }
    
}
