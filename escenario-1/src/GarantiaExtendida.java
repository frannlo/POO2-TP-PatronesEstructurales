public class GarantiaExtendida extends Decorador{

    public GarantiaExtendida(ComponentePC componente, double costoAdicional){
        super(componente);
    }

    public double getPrecio(){
        return super.getPrecio() * 1.10;
    }

    public String nombre(){
        return super.getNombre() + " (con garantía extendida)";
    }
}
