package externo.logisticaveloz;

/**
 * DTO expuesto por la librería de LogísticaVeloz.
 */
public class Cotizacion {

    private final float costo;
    private final int dias;

    public Cotizacion(float costo, int dias) {
        this.costo = costo;
        this.dias = dias;
    }

    public float getCosto() {
        return costo;
    }

    public int getDias() {
        return dias;
    }
}

