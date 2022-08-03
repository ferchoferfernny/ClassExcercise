package State;

import java.sql.Date;
import java.util.ArrayList;

import State.Estados.Activo;

public class Carrito {

    private Estado actual;
    public ArrayList <Producto> contenido;
    private Date diaCreacion; 

    

    public Carrito ( ArrayList <Producto> contenido){

        this.actual = new Activo();
        this.contenido=contenido;
        this.diaCreacion= new Date(System.currentTimeMillis());

    }

    public Estado getActual() {
        return actual;
    }

    public void setActual(Estado actual) {
        this.actual = actual;
    }

    public Date getDiaCreacion() {
        return diaCreacion;
    }

    public void SetNuevoLimite() {
        this.diaCreacion= new Date(System.currentTimeMillis());
    }

    
    








    
}
