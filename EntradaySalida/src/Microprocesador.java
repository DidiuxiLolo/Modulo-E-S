import javax.swing.JOptionPane;

public class Microprocesador extends Dispositivos
{
	Dispositivos bus = new Dispositivos();
	
	public void correrPrograma() {
		JOptionPane.showMessageDialog(null,"Ejecutando programa","Procesador",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void mandarRead() {
		JOptionPane.showMessageDialog(null,"Mandando orden de READ","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.recibirRead();
	}
	
	public void guardarDatos() {
		JOptionPane.showMessageDialog(null,"Guardando contador de programa y registros","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.solicitud();
	}
	
	public void lecturaDatos() {
		JOptionPane.showMessageDialog(null,"Leyendo la palabra y almacenando en memoria","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.situando();
	}
	
	public void seguirPrograma() {
		JOptionPane.showMessageDialog(null,"Ejecutando programa","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.espera();	
	}
}
