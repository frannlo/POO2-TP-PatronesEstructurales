// RenderizadorPDF.java
package ar.universidad.contabilidad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RenderizadorPDF {

    // En vez de generar PDF real, por simplicidad generamos un .txt simulado
    public File generarPDF(MontosImpuestos montos) {
        System.out.println("[RenderizadorPDF] Generando archivo (simulado).");
        try {
            File archivo = File.createTempFile("reporte_fiscal_", ".txt");
            try (FileWriter w = new FileWriter(archivo)) {
                w.write("REPORTE FISCAL SIMULADO\n");
                w.write("Neto: " + montos.getNeto() + "\n");
                w.write("Impuesto: " + montos.getImpuesto() + "\n");
                w.write("Total: " + montos.getTotal() + "\n");
            }
            return archivo;
        } catch (IOException e) {
            throw new RuntimeException("No se pudo generar el archivo", e);
        }
    }
}
