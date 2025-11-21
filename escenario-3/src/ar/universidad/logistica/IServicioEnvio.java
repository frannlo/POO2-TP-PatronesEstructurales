package ar.universidad.logistica;

/**
 * Interfaz interna que abstrae los servicios de envío soportados por el
 * e-commerce.
 */
public interface IServicioEnvio {

    /**
     * Calcula el costo del envío hacia el código postal indicado.
     *
     * @param codigoPostal código postal destino expresado como texto
     * @return costo en dólares
     */
    float calcularCosto(String codigoPostal);

    /**
     * Obtiene el tiempo estimado de entrega hacia el destino indicado.
     *
     * @param codigoPostal código postal destino expresado como texto
     * @return descripción human readable del tiempo estimado
     */
    String obtenerTiempoEstimado(String codigoPostal);

    /**
     * Genera la orden de despacho para el pedido recibido.
     *
     * @param direccion   domicilio del destinatario
     * @param codigoPostal código postal destino
     * @param idPedido    identificador interno del pedido
     * @return número de seguimiento generado por el operador logístico
     */
    String despacharPedido(String direccion, String codigoPostal, String idPedido);
}

