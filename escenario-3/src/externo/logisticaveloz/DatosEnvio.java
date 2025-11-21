package externo.logisticaveloz;

/**
 * DTO requerido por la API de LogísticaVeloz para despachar pedidos.
 */
public class DatosEnvio {

    private String direccion;
    private int cpDestino;
    private String idPedido;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCpDestino() {
        return cpDestino;
    }

    public void setCpDestino(int cpDestino) {
        this.cpDestino = cpDestino;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
}

