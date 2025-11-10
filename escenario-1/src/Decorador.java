public abstract class Decorador implements ComponentePC{
    protected ComponentePC componente;

    public Decorador(ComponentePC componente){
        this.componente = componente;
    }

    @Override
    public String getNombre(){
        return componente.getNombre();
    }

    @Override
    public double getPrecio(){
        return componente.getPrecio();
    }

}