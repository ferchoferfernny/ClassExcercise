package AbstractFactory;

import AbstractFactory.Interfaces.Fabrica;
import AbstractFactory.Interfaces.IActivosProducto;
import AbstractFactory.Interfaces.IBaseProducto;

public class OrdenProduccion {
     private IBaseProducto base;
     private IActivosProducto activos;

     public OrdenProduccion ( Fabrica laPlanta){
        this.base= laPlanta.crearBase();
        this.activos= laPlanta.adicionarActivos();
     }

     public String comprobarDispoibilidad (){

        return ("la viabilidad tecnica del proceso");
     }
     public void GenerarProdcuto (){
        
        System.out.println(" Se empezo a realizar el producto");
     }
}
