import javax.swing.*;

public class CajeraSwing extends Thread {
    private String nombre;
    private Cliente cliente;
    private DefaultListModel<String> modeloLista;

    public CajeraSwing(String nombre, Cliente cliente, DefaultListModel<String> modeloLista) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.modeloLista = modeloLista;
    }

    @Override
    public void run() {
        modeloLista.addElement("Cajera " + nombre + " procesando compra de " + cliente.getNombre());

        for (Producto producto : cliente.getProductos()) {
            try {
                Thread.sleep(producto.getTiempoProcesamiento() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            modeloLista.addElement("Producto: " + producto.getNombre() + " - $" + producto.getPrecio() + " COP");
        }

        modeloLista.addElement("Cobro finalizado para " + cliente.getNombre());
    }
}
