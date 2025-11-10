public class GarantiaExtendida extends Decorador {
    
    public GarantiaExtendida(ComponentePC componente) {
        super(componente);
    }
    
    @Override
    public double getPrecio() {
        return super.getPrecio() * 1.10; 
    }
    
    @Override
    public String getNombre() {
        return super.getNombre() + " (con Garantía Extendida)";
    }
}

