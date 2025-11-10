
public class CarritoDeCompras{
    public static void main(String[] args){
        //Creamos componentes individuales
        ComponentePC cpu = new CPU("Intel i7", 300.0);
        ComponentePC ram = new MemoriaRAM("Corsair 16GB", 150.0);
        ComponentePC disco = new DiscoSSD("Seagate 1TB", 100.0);
        //Creamos componentes compuestos
        Gabinete gabinete = new Gabinete("Gabinete ATX", 50.0);
        gabinete.agregarComponente(cpu);
        gabinete.agregarComponente(ram);
        gabinete.agregarComponente(disco);

        PlacaMadre placaMadre = new PlacaMadre("ASUS Prime", 200.0);
        placaMadre.agregarComponente(gabinete);

        //Agregamos decoradores
        ComponentePC gabineteConInstalacion = new ServicioInstalacion(gabinete); 
        //Pide garantia extendida para la pc completa
        ComponentePC pcCompletaDecorada = new GarantiaExtendida(gabineteConInstalacion); 

        // Calculamos precio total 
        System.out.println("Componete: " + pcCompletaDecorada.getNombre()
            + " | Precio Total: $" + pcCompletaDecorada.getPrecio()
        );

        // Y si queremos decorar un componente individual
        ComponentePC discoConGarantia = new GarantiaExtendida(new DiscoSSD("ELDISCO WN", 80.0));
        System.out.println("\nComponente: " + discoConGarantia.getNombre());
        System.out.println("Precio Final: $" + discoConGarantia.getPrecio());



    }
}