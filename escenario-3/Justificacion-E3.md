# Escenario 3 - Integración de API de Logística

## 1. Análisis del escenario
- El e-commerce depende de la interfaz interna `IServicioEnvio`, utilizada por el carrito y el módulo de despacho.
- El nuevo proveedor, LogísticaVeloz, ofrece un SDK con métodos y modelos incompatibles (`cotizarEnvio(int)`, `enviarPaquete(DatosEnvio)`).
- Cambiar el código del cliente para adaptarse al SDK generaría alto acoplamiento y duplicaría lógica para cada proveedor.

## 2. Patrón seleccionado
- **Adapter (Object Adapter)**: permite traducir la interfaz del proveedor externo a la interfaz `IServicioEnvio` sin modificar el código existente ni la librería.
- Se eligió la variante por composición para mantener el encapsulamiento de la API externa.

## 3. Justificación
- El Adapter desacopla al cliente de los detalles del SDK, cumpliendo la intención del patrón: *“convertir la interfaz de una clase en otra esperada por el cliente”*.
- Facilita la extensión: nuevos proveedores sólo requieren nuevos adapters.
- Centraliza la conversión de tipos (String → int para CP, objetos `DatosEnvio`), evitando errores duplicados.

## 4. Implementación
- `IServicioEnvio`: interfaz original utilizada por la aplicación.
- `ApiLogisticaVeloz`, `Cotizacion`, `DatosEnvio`: simulación de la librería externa, marcada como inmodificable.
- `LogisticaVelozAdapter`: traduce las llamadas (`calcularCosto`, `obtenerTiempoEstimado`, `despacharPedido`) a los métodos del SDK.
  - Convierte tipos y encapsula la creación de `DatosEnvio`.
  - Normaliza las respuestas (string con “días”, número de tracking).
- `AppDemo`: cliente que prueba la integración sin conocer la API externa.

## 5. Beneficios
- Clientes internos siguen trabajando con `IServicioEnvio`.
- Posibles cambios en LogísticaVeloz quedan confinados al adapter.
- Se mantiene una única fuente de verdad para las reglas de conversión.

