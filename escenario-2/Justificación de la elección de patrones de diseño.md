1. Problema detectado

El cliente (la interfaz de usuario) debía realizar múltiples pasos manuales para generar un reporte fiscal:

Conectarse a la base de datos.

Obtener el CUIT del cliente.

Autenticarse ante el servicio web de AFIP.

Solicitar los datos fiscales.

Calcular los montos de impuestos.

Generar el archivo PDF final.

Este proceso requiere instanciar y coordinar múltiples clases, en un orden específico.
Como consecuencia:

El cliente queda fuertemente acoplado a los subsistemas internos.

Se duplica código cuando otros módulos quieren generar reportes.

La mantención y el cambio se vuelven complejos.

2. Patrón aplicado: Facade

Se eligió el patrón Facade para encapsular la complejidad del proceso de generación del reporte y exponer una interfaz simple al cliente.

Intención del patrón Facade:
“Proveer una interfaz simplificada y unificada para un conjunto de subsistemas complejos.”

La clase GeneradorReporteFacade actúa como fachada centralizando:

La conexión con la BD (ConectorDB)

La obtención del CUIT (LectorDeDatos)

La comunicación con AFIP (ServicioWebAFIP)

El cálculo de impuestos (ProcesadorDeImpuestos)

La generación de PDF (RenderizadorPDF)
