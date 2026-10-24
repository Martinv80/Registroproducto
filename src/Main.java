public class Main {
    public static void main(String[] args) {

        // Creación de cinco productos según las especificaciones
        Producto producto1 = new Producto("Mouse", 25.50, 10);
        Producto producto2 = new Producto("Teclado Mecánico", 65.00, 15);
        Producto producto3 = new Producto("Monitor 24 pulgadas", 180.00, 8);
        Producto producto4 = new Producto("Audífonos Bluetooth", 45.90, 20);
        Producto producto5 = new Producto("Soporte para Laptop", 18.25, 30);

        // Mostrar detalle de cada producto para comprobar los IDs correlativos
        System.out.println("=== LISTADO DE PRODUCTOS REGISTRADOS ===");
        producto1.mostrarDetalle();
        producto2.mostrarDetalle();
        producto3.mostrarDetalle();
        producto4.mostrarDetalle();
        producto5.mostrarDetalle();

        // Mostrar total de productos registrados usando el miembro static
        System.out.println("------------------------------------");
        System.out.println("Total de productos: " + Producto.getTotalProductos());
    }
}