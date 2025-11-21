package ar.universidad.logistica;

import externo.logisticaveloz.ApiLogisticaVeloz;

/**
 * Cliente de ejemplo que utiliza la aplicación a través de la interfaz interna.
 */
public class AppDemo {

    public static void main(String[] args) {
        IServicioEnvio servicioEnvio = new LogisticaVelozAdapter(new ApiLogisticaVeloz());

        String codigoPostal = "1000";
        System.out.printf("Costo: %.2f%n", servicioEnvio.calcularCosto(codigoPostal));
        System.out.println("Tiempo estimado: " + servicioEnvio.obtenerTiempoEstimado(codigoPostal));
        System.out.println("Tracking: " + servicioEnvio.despacharPedido("Av. Siempre Viva 742", codigoPostal, "PED-123"));
    }
}

