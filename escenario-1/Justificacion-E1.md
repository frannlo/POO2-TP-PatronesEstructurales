# Justificación de la elección de patrones de diseño

## 1. Patrón **Composite**

Se eligió el patrón **Composite** para poder tratar de manera uniforme tanto a los componentes individuales (*Hojas*, por ejemplo **CPU**) como a los componentes compuestos (*Composites*, por ejemplo **Gabinete**). 

La intención del patrón es *"componer objetos en estructuras de árbol para representar jerarquías parte-todo"*, esto modela correctamente el ensamblaje de una PC.

Mediante una interfaz común `ComponentePC`, el cliente (`CarritoDeCompras`) puede invocar el método `getPrecio()` sobre cualquier elemento, y el **Composite** (por ejemplo, `PlacaMadre`) se encarga de delegar el cálculo a sus hijos y sumar sus propios costos, **desacoplando al cliente de la estructura interna**.


## 2. Patrón **Decorator**

Se eligió el patrón **Decorator** para cumplir con el rquisito de añadir *"extras"* (`GarantíaExtendida`, `ServicioInstalación`) a cualquier `ComponentePC`, ya sea simple o compuesto. 

La intención del patrón es *"adjuntar responsabilidades adicionales a un objeto dinámicamente"*, lo cual es una alternativa flexible a la herencia.

Dado que los extras deben ser combinables, la estructura de *envoltorios* del **Decorator** permite **apilar responsabilidades** (por ejemplo:  
`new GarantiaExtendida(new ServicioInstalacion(...))`) sin modificar el código de los componentes base, **adhiriendo al principio de Abierto/Cerrado**.
