public class Producto {

    // Atributos privados de instancia
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Atributo estático (compartido por la clase)
    private static int contadorProductos = 0;

    // Constructor requerido
    public Producto(String nombre, double precio, int stock) {
        contadorProductos++;          // Incrementa el contador global
        this.id = contadorProductos;  // Asigna el nuevo valor como ID único
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    // Método estático para consultar el total acumulado
    public static int getTotalProductos() {
        return contadorProductos;
    }

    // Método para mostrar la información del producto
    public void mostrarDetalle() {
        System.out.println("ID: " + this.id +
                " | Producto: " + this.nombre +
                " | Precio: $" + this.precio +
                " | Stock: " + this.stock);
    }
}