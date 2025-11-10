// LectorDeDatos.java
package ar.universidad.contabilidad;

public class LectorDeDatos {
    private ConectorDB conector;

    public LectorDeDatos(ConectorDB conector) {
        this.conector = conector;
    }

    // Simula la obtención de CUIT a partir de un idCliente
    public String obtenerCUIT(String idCliente) {
        System.out.println("[LectorDeDatos] Obteniendo CUIT para id: " + idCliente);
        // en la realidad, haría query SQL usando conector.getConnection()
        return "20-12345678-9"; // valor simulado
    }
}
