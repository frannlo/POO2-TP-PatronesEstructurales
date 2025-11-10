// GeneradorReporteFacade.java
package ar.universidad.contabilidad;

import java.io.File;

public class GeneradorReporteFacade {

    public File generarReporte(String idCliente) {
        // 1. Conectar a BD
        ConectorDB conector = new ConectorDB();
        conector.conectar();

        try {
            // 2. Obtener CUIT
            LectorDeDatos lector = new LectorDeDatos(conector);
            String cuit = lector.obtenerCUIT(idCliente);

            // 3. Servicio AFIP
            ServicioWebAFIP afip = new ServicioWebAFIP();
            afip.autenticar();
            DatosFiscales datosFiscales = afip.obtenerDatosFiscales(cuit);

            // 4. Procesar impuestos
            ProcesadorDeImpuestos procesador = new ProcesadorDeImpuestos();
            MontosImpuestos montos = procesador.calcularMontos(datosFiscales);

            // 5. Generar PDF
            RenderizadorPDF renderizador = new RenderizadorPDF();
            File archivo = renderizador.generarPDF(montos);

            System.out.println("[Facade] Reporte generado en: " + archivo.getAbsolutePath());
            return archivo;
        } finally {
            // Asegurar cierre de recursos
            conector.desconectar();
        }
    }
}
