public class Cajera extends Thread {
    private String nombre;
    private Cliente cliente;

    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        System.out.println("Cajera " + nombre + " comienza a cobrar a " + cliente.getNombre());
        long tiempoInicio = System.currentTimeMillis();

        for (Producto producto : cliente.getProductos()) {
            try {
                Thread.sleep(producto.getTiempoProcesamiento() * 1000); // Simulación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producto: " + producto.getNombre() + " - Precio: $" + producto.getPrecio() + " COP");
        }

        long tiempoTotal = (System.currentTimeMillis() - tiempoInicio) / 1000;
        System.out.println(
                "Cobro finalizado para " + cliente.getNombre() + ". Tiempo total: " + tiempoTotal + " segundos.");
    }
}