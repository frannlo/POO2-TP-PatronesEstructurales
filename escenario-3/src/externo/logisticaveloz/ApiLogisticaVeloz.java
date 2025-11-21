package externo.logisticaveloz;

/**
 * Simulación de la librería externa entregada por el proveedor LogísticaVeloz.
 * <p>
 * No podemos modificar esta clase porque proviene de un .jar tercero.
 */
public class ApiLogisticaVeloz {

    public Cotizacion cotizarEnvio(int cpDestino) {
        // Lógica compleja oculta...
        return new Cotizacion(150.50f, 2);
    }

    public String enviarPaquete(DatosEnvio datos) {
        // Lógica compleja oculta...
        return "LV-987654321";
    }
}

