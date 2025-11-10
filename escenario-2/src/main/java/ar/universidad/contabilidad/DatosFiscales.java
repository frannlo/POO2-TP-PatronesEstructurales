// DatosFiscales.java
package ar.universidad.contabilidad;

public class DatosFiscales {
    private String cuit;
    private double ingresos;
    private double gastos;

    public DatosFiscales(String cuit, double ingresos, double gastos) {
        this.cuit = cuit;
        this.ingresos = ingresos;
        this.gastos = gastos;
    }

    public String getCuit() { return cuit; }
    public double getIngresos() { return ingresos; }
    public double getGastos() { return gastos; }
}
