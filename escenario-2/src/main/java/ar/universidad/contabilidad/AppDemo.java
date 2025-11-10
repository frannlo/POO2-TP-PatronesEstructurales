// AppDemo.java
package ar.universidad.contabilidad;

import java.io.File;

public class AppDemo {
    public static void main(String[] args) {
        GeneradorReporteFacade facade = new GeneradorReporteFacade();
        File reporte = facade.generarReporte("cliente-001");
        System.out.println("Archivo de reporte: " + reporte.getAbsolutePath());
    }
}
