package AbstractFactory;

import AbstractFactory.Interfaces.Fabrica;
import AbstractFactory.Productos.GelHidratante;
import AbstractFactory.Productos.LocionOjos;

public class main {
    public static void main(String[] args) {

    Fabrica plantaHidraBel = new GelHidratante();
    Fabrica plantaBellaPiel = new LocionOjos();

    OrdenProduccion op1 = new OrdenProduccion(plantaHidraBel);
    OrdenProduccion op2 = new OrdenProduccion(plantaBellaPiel);
    
    op1.comprobarDispoibilidad();
    op1.GenerarProdcuto();

    op2.GenerarProdcuto();


    }
}
