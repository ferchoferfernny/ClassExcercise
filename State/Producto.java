package State;

import java.security.Principal;

public class Producto {

    private String nombre; 
    private int id;
    private float costo;
    private float valorPublico;
    private float valorMayorista;
    private String descripcion;

    public Producto (String nombre ,int id, float costo, String descripcion ){
        this.nombre=nombre;
        this.id= id; 
        this.costo= costo;
        this.valorPublico= costo * 1.2f;
        this.valorMayorista= costo * 1.05f;
        this.descripcion= descripcion;

    }

    // se debe adicionar los metodos de gestion como getter y setters de esta clase 
    
}
