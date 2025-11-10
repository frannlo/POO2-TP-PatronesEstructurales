// ConectorDB.java
package ar.universidad.contabilidad;
import java.sql.Connection;

public class ConectorDB {
    private Connection conn;

    public void conectar() {
        // Simulación: no conectamos a BD real
        System.out.println("[ConectorDB] Conexión simulada establecida.");
        conn = null; // en impl real sería la conexión
    }

    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        System.out.println("[ConectorDB] Conexión cerrada (simulada).");
    }
}
