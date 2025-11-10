// ServicioWebAFIP.java
package ar.universidad.contabilidad;

public class ServicioWebAFIP {

    public void autenticar() {
        System.out.println("[ServicioWebAFIP] Autenticación simulada OK.");
    }

    public DatosFiscales obtenerDatosFiscales(String cuit) {
        System.out.println("[ServicioWebAFIP] Solicitando datos fiscales para: " + cuit);
        // Simulamos: retornamos datos ficticios
        return new DatosFiscales(cuit, 100000.0, 40000.0);
    }
}
