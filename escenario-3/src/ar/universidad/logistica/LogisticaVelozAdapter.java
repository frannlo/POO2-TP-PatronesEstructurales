package ar.universidad.logistica;

import externo.logisticaveloz.ApiLogisticaVeloz;
import externo.logisticaveloz.Cotizacion;
import externo.logisticaveloz.DatosEnvio;

/**
 * Adapter de objeto que permite reutilizar la API de LogísticaVeloz respetando
 * la interfaz interna IServicioEnvio.
 */
public class LogisticaVelozAdapter implements IServicioEnvio {

    private final ApiLogisticaVeloz api;

    public LogisticaVelozAdapter(ApiLogisticaVeloz api) {
        this.api = api;
    }

    @Override
    public float calcularCosto(String codigoPostal) {
        return cotizar(codigoPostal).getCosto();
    }

    @Override
    public String obtenerTiempoEstimado(String codigoPostal) {
        Cotizacion cotizacion = cotizar(codigoPostal);
        return cotizacion.getDias() + " días";
    }

    @Override
    public String despacharPedido(String direccion, String codigoPostal, String idPedido) {
        DatosEnvio datosEnvio = new DatosEnvio();
        datosEnvio.setDireccion(direccion);
        datosEnvio.setCpDestino(parsearCodigoPostal(codigoPostal));
        datosEnvio.setIdPedido(idPedido);

        return api.enviarPaquete(datosEnvio);
    }

    private Cotizacion cotizar(String codigoPostal) {
        int cpDestino = parsearCodigoPostal(codigoPostal);
        return api.cotizarEnvio(cpDestino);
    }

    private int parsearCodigoPostal(String codigoPostal) {
        try {
            return Integer.parseInt(codigoPostal);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("El código postal debe ser numérico", ex);
        }
    }
}

