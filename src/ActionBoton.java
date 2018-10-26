import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author Sergio Bejarano Martin
 **
 */
public class ActionBoton implements ActionListener{

	private ControlJuego juego; 
	private int i;
	private int j;
	private VentanaPrincipal ventana;
	
	public ActionBoton(ControlJuego juego, int i, int j, VentanaPrincipal ventana) {
		this.juego = juego;
		this.ventana = ventana;
		this.i = i;
		this.j = j;
	}

	
	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(juego.abrirCasilla(i,j)) {
			ventana.mostrarNumMinasAlrededor(i, j);
			
		}
		
		if(juego.esFinJuego()) {
			ventana.mostrarFinJuego(false);
		} else if(juego.getMinasAlrededor(i, j)==-1) {
			ventana.mostrarFinJuego(true);
		}
	}

}
