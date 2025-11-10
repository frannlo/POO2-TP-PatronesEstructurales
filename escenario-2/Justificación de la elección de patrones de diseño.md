Justificación de la elección de patrones de diseño
1. Patrón Facade

Se eligió el patrón Facade para simplificar el proceso de generación de reportes fiscales, el cual originalmente requería que el cliente interactúe de forma directa con múltiples clases y realice los pasos en un orden específico (conexión a base de datos, obtención de CUIT, autenticación con AFIP, obtención de datos fiscales, procesamiento de impuestos y generación del PDF).

La intención del patrón es “proveer una interfaz unificada para un conjunto de interfaces en un subsistema”, reduciendo la complejidad visible hacia el cliente.
En este caso, la clase GeneradorReporteFacade expone un único método generarReporte(idCliente), el cual se encarga internamente de coordinar todos los componentes necesarios:

ConectorDB (gestiona la conexión)

LectorDeDatos (obtiene el CUIT)

ServicioWebAFIP (recupera los datos fiscales)

ProcesadorDeImpuestos (calcula los montos resultantes)

RenderizadorPDF (genera el archivo de salida)

De esta manera, el cliente solo necesita interactuar con la fachada, manteniéndose desacoplado de los detalles internos del proceso.
Además, posibles cambios en la lógica (por ejemplo, cambiar el servicio web, modificar cálculos, o generar otro tipo de reporte) no afectan al cliente, ya que se encuentran encapsulados detrás del Facade, favoreciendo los principios de Abierto/Cerrado y Responsabilidad Única.

En conclusión, la aplicación del patrón Facade permite ocultar la complejidad del subsistema de generación de reportes, reducir el acoplamiento entre la interfaz de usuario y los componentes internos, y ofrecer una API clara, coherente y fácil de usar.
