import java.util.ArrayList;
import java.util.List;

public class PlacaMadre implements ComponentePC{
    private String nombre;
    private double precioBase;
    //Lista de componentes que forman parte del componente compuesto
    private List<ComponentePC> componentes = new ArrayList<>();

    public PlacaMadre(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    //Metodo para añadir componentes al compuesto
    public void agregarComponente(ComponentePC componente){
        this.componentes.add(componente);
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public double getPrecio(){
        /*Acá usamos el patrón Composite que nos permite 
        sumar el precio base + precio de todos los componentes "hijos" */
        double precioTotalComponentes = 0;
        for(ComponentePC componente : componentes){
            precioTotalComponentes += componente.getPrecio();
        }
        return precioBase + precioTotalComponentes;
    }
}