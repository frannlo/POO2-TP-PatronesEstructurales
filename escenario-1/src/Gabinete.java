import java.util.*;

public class Gabinete implements ComponentePC{
    private double precioBase;
    private String nombre;
    private List<ComponentePC> componentes = new ArrayList<>();


    //Constructor
    public Gabinete(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase; 
    }
    
    public void agregarComponente(ComponentePC componente){
        this.componentes.add(componente);
    }

    @Override
    public String getNombre(){ return this.nombre;}
    @Override
    public double getPrecio(){
        double precioComponentes = 0;
        for (ComponentePC componente : componentes){
            precioComponentes += componente.getPrecio();
        }
    
        return this.precioBase + precioComponentes;
    }

    
}
