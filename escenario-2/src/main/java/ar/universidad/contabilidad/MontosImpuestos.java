// MontosImpuestos.java
package ar.universidad.contabilidad;

public class MontosImpuestos {
    private double neto;
    private double impuesto;
    private double total;

    public MontosImpuestos(double neto, double impuesto, double total) {
        this.neto = neto;
        this.impuesto = impuesto;
        this.total = total;
    }

    public double getNeto() { return neto; }
    public double getImpuesto() { return impuesto; }
    public double getTotal() { return total; }
}
