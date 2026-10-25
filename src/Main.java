void main() {

    Producto producto = new Producto("P-001", "Teclado mecánico", 45000.0, 10);

    System.out.println("=== Estado inicial ===");
    System.out.println(producto);

    System.out.println("\n=== Ventas exitosas ===");
    producto.registrarVenta(3);
    producto.registrarVenta(7);   // deja el stock en 0 (límite exacto)

    System.out.println("\n=== Ventas fallidas ===");
    producto.registrarVenta(1);   // sin stock
    producto.registrarVenta(-2);  // cantidad inválida
    producto.registrarVenta(0);   // cantidad inválida

    System.out.println("\n=== Reabastecimiento ===");
    producto.registrarIngresoStock(20);
    producto.registrarIngresoStock(-5);  // inválido
    producto.registrarVenta(25);         // más de lo que hay (20)
    producto.registrarVenta(15);         // exitosa

    System.out.println("\n=== Precio ===");
    producto.setPrecio(48000.0);
    producto.setPrecio(-100.0);          // inválido

    System.out.println("\n=== Estado final ===");
    System.out.println(producto);
    System.out.println("Stock disponible: " + producto.getStock());

    System.out.println("\n=== Constructor con datos inválidos ===");
    try {
        new Producto("P-002", "Mouse", 15000.0, -4);
    } catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear el producto: " + e.getMessage());
    }

}
