import java.awt.EventQueue;

/**
 * Clase principal
 * @author Sergio Bejarano Martin
 * @version 1.1.0
 * @since 1.0.0
 *
 */
public class Principal {

	/**
	 * Método main
	 * @param args : Cadenas de parámetros del main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventana = new VentanaPrincipal();
					ventana.inicializar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}



