import java.util.Arrays;

public class Supermercado {
    public static void main(String[] args) {
        // Crear productos con precios en COP
        Producto producto1 = new Producto("Arroz", 5000.0, 2);
        Producto producto2 = new Producto("Leche", 3500.0, 1);
        Producto producto3 = new Producto("Pan", 2800.0, 3);
        Producto producto4 = new Producto("Huevos", 15000.0, 2);
        Producto producto5 = new Producto("Aceite", 25000.0, 3);
        Producto producto6 = new Producto("Cereal", 12000.0, 1);
        Producto producto7 = new Producto("Jugo", 8000.0, 2);
        Producto producto8 = new Producto("Carne", 45000.0, 4);
        Producto producto9 = new Producto("Queso", 18000.0, 2);
        Producto producto10 = new Producto("Pollo", 35000.0, 3);

        // Crear clientes con diferentes productos
        Cliente cliente1 = new Cliente("Juan", Arrays.asList(producto1, producto2, producto8));
        Cliente cliente2 = new Cliente("Ana", Arrays.asList(producto3, producto4, producto9));
        Cliente cliente3 = new Cliente("Luis", Arrays.asList(producto5, producto6, producto10));
        Cliente cliente4 = new Cliente("Sofia", Arrays.asList(producto7, producto8, producto10));

        // Crear cajeras
        Cajera cajera1 = new Cajera("Cajera 1", cliente1);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2);
        Cajera cajera3 = new Cajera("Cajera 3", cliente3);
        Cajera cajera4 = new Cajera("Cajera 4", cliente4);

        // Iniciar todas las cajeras simultáneamente
        cajera1.start();
        cajera2.start();
        cajera3.start();
        cajera4.start();
    }
}