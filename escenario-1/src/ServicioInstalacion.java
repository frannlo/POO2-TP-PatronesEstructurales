public class ServicioInstalacion extends Decorador{
    public ServicioInstalacion(ComponentePC componente){
        super(componente);
    }

    @Override
    public double getPrecio(){
        return super.getPrecio() + 50.0;
    }

    @Override
    public String getNombre(){
        return super.getNombre() + " (con servicio de instalación)";
    }    
}
