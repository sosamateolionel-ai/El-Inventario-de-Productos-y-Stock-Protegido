# Sistema de Gestión de Productos e Inventario

## Descripción

Este proyecto implementa un sistema básico de gestión de productos en Java. Permite administrar la información de un producto, actualizar su precio, registrar ventas y realizar ingresos de stock, aplicando validaciones para evitar operaciones inválidas.

## Funcionamiento

El programa crea un producto con código, nombre, precio y stock inicial. Luego ejecuta diferentes operaciones para comprobar el funcionamiento de sus métodos.

* **Creación de productos:** valida que el código y el nombre no estén vacíos, que el precio sea mayor a cero y que el stock inicial no sea negativo.
* **Consulta de información:** permite obtener el código, nombre, precio y stock mediante métodos `get`.
* **Actualización del precio:** permite modificar el precio únicamente si el nuevo valor es mayor a cero.
* **Registro de ventas:** descuenta unidades del stock cuando la cantidad es válida y existe stock suficiente.
* **Ingreso de stock:** aumenta las unidades disponibles cuando la cantidad ingresada es mayor a cero.
* **Validación de operaciones:** rechaza cantidades negativas o iguales a cero, ventas sin stock suficiente y datos iniciales inválidos.
* **Visualización del producto:** utiliza el método `toString()` para mostrar el código, nombre, precio y stock actual.

## Clase principal

### `Producto`

Contiene los atributos y métodos necesarios para representar un producto y controlar su inventario.

**Atributos:**

* `codigo`: identificador único del producto, declarado como `final` para impedir su modificación después de la inicialización.
* `nombre`: nombre del producto.
* `precio`: precio actual del producto.
* `stock`: cantidad de unidades disponibles.

**Métodos principales:**

* `getCodigo()`, `getNombre()`, `getPrecio()` y `getStock()`: permiten consultar los atributos.
* `setPrecio(double nuevoPrecio)`: actualiza el precio si cumple la validación.
* `registrarIngresoStock(int cantidad)`: incrementa el inventario.
* `registrarVenta(int cantidad)`: registra una venta y descuenta las unidades correspondientes.
* `toString()`: devuelve una representación textual del producto.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación de un producto mediante una clase.
* **Encapsulamiento:** atributos privados y acceso controlado a través de métodos públicos.
* **Inmutabilidad parcial:** el código del producto no puede modificarse después de su creación.
* **Validación de datos:** comprobación de los valores recibidos en el constructor y en las operaciones.
* **Estructuras condicionales:** uso de `if` para controlar las operaciones permitidas.
* **Manejo de excepciones:** utilización de `IllegalArgumentException` y `try-catch` para gestionar datos iniciales inválidos.
* **Sobrescritura de métodos:** implementación de `toString()` para mostrar información del objeto.
* **Retorno booleano:** los métodos de modificación y operaciones de stock indican si la operación fue exitosa.

## Ejecución

<img width="785" height="758" alt="image" src="https://github.com/user-attachments/assets/be2f430e-05c8-4292-9165-d7107dd404c3" />

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento y validación en Java mediante la creación de una clase que controle las operaciones sobre un producto, garantizando que las ventas, los ingresos de stock y las modificaciones de precio respeten las reglas establecidas.
