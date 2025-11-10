public class CPU implements ComponentePC{
    private double precio;
    private String nombre;

    //Constructor
    public CPU(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio; 
    }

    @Override
    public String getNombre(){ return this.nombre;}
    @Override
    public double getPrecio(){return this.precio;}
}
