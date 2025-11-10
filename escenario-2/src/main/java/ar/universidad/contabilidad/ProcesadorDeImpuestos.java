// ProcesadorDeImpuestos.java
package ar.universidad.contabilidad;
public class ProcesadorDeImpuestos {

    public MontosImpuestos calcularMontos(DatosFiscales datos) {
        System.out.println("[ProcesadorDeImpuestos] Calculando montos para CUIT: " + datos.getCuit());
        double neto = datos.getIngresos() - datos.getGastos();
        double impuesto = neto * 0.21; // ejemplo: IVA 21% (solo para demo)
        double total = neto + impuesto;
        return new MontosImpuestos(neto, impuesto, total);
    }
}
