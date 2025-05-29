import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SupermercadoSwing extends JFrame {
    private DefaultListModel<String> modeloLista;
    private JList<String> listaClientes;
    private JButton iniciarCobro;

    public SupermercadoSwing() {
        setTitle("Simulación de Supermercado 🛒");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Título
        JLabel titulo = new JLabel("Supermercado en ejecución", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));

        // Lista de clientes
        modeloLista = new DefaultListModel<>();
        listaClientes = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(listaClientes);

        // Botón para iniciar el cobro
        iniciarCobro = new JButton("Iniciar cobro");
        iniciarCobro.addActionListener(e -> procesarCobro());

        // Agregar elementos al JFrame
        add(titulo, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(iniciarCobro, BorderLayout.SOUTH);
    }

    private void procesarCobro() {
        modeloLista.clear();

        // Crear lista de clientes con sus productos
        Cliente cliente1 = new Cliente("Juan",
                Arrays.asList(new Producto("Arroz", 5000.0, 2), new Producto("Leche", 3500.0, 1)));
        Cliente cliente2 = new Cliente("Ana",
                Arrays.asList(new Producto("Pan", 2800.0, 3), new Producto("Huevos", 15000.0, 2)));
        Cliente cliente3 = new Cliente("Luis",
                Arrays.asList(new Producto("Aceite", 25000.0, 3), new Producto("Cereal", 12000.0, 1)));
        Cliente cliente4 = new Cliente("Sofia",
                Arrays.asList(new Producto("Jugo", 8000.0, 2), new Producto("Carne", 45000.0, 4)));

        // Crear cajeras
        modeloLista.addElement("Cajera 1 atiende a " + cliente1.getNombre());
        modeloLista.addElement("Cajera 2 atiende a " + cliente2.getNombre());
        modeloLista.addElement("Cajera 3 atiende a " + cliente3.getNombre());
        modeloLista.addElement("Cajera 4 atiende a " + cliente4.getNombre());

        new CajeraSwing("Cajera 1", cliente1, modeloLista).start();
        new CajeraSwing("Cajera 2", cliente2, modeloLista).start();
        new CajeraSwing("Cajera 3", cliente3, modeloLista).start();
        new CajeraSwing("Cajera 4", cliente4, modeloLista).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SupermercadoSwing().setVisible(true));
    }
}
