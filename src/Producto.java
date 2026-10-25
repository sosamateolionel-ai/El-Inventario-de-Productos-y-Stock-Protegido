public class Producto {

    private final String codigo; // identidad del producto: no cambia
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stockInicial) {

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }
        if (stockInicial < 0) {
            throw new IllegalArgumentException("El stock inicial no puede ser negativo.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stockInicial;
    }

    // ----- Getters (el stock solo se puede leer) -----

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // ----- Setter con validación -----

    public boolean setPrecio(double nuevoPrecio) {

        if (nuevoPrecio <= 0) {
            System.out.println("Precio rechazado: debe ser mayor a cero (" + nuevoPrecio + ").");
            return false;
        }

        precio = nuevoPrecio;
        return true;
    }

    // ----- Operaciones controladas sobre el stock -----

    public boolean registrarIngresoStock(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Ingreso rechazado: la cantidad debe ser mayor a cero (" + cantidad + ").");
            return false;
        }

        stock = stock + cantidad;
        System.out.println("Ingreso de " + cantidad + " unidades de " + nombre + ". Stock: " + stock);
        return true;
    }

    public boolean registrarVenta(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Venta rechazada: la cantidad debe ser mayor a cero (" + cantidad + ").");
            return false;
        }

        if (cantidad > stock) {
            System.out.println("Venta rechazada: se piden " + cantidad + " unidades de " + nombre
                    + " pero solo hay " + stock + ".");
            return false;
        }

        stock = stock - cantidad;
        System.out.println("Venta de " + cantidad + " unidades de " + nombre + ". Stock: " + stock);
        return true;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre + " | Precio: $" + String.format("%.2f", precio) + " | Stock: " + stock;
    }
}