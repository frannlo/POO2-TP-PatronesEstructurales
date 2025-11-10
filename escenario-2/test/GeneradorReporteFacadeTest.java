// GeneradorReporteFacadeTest.java  (JUnit 5)
package ar.universidad.contabilidad;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;

public class GeneradorReporteFacadeTest {

    @Test
    public void testGenerarReporteDevuelveArchivo() {
        GeneradorReporteFacade facade = new GeneradorReporteFacade();
        File f = facade.generarReporte("cliente-test");
        assertNotNull(f);
        assertTrue(f.exists());
        // opcionalmente borrar archivo temporal
        f.delete();
    }
}
