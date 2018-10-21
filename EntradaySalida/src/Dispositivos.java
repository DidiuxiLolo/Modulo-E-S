import javax.swing.JOptionPane;

public class Dispositivos 
{
	
	public void recibirRead() {
		JOptionPane.showMessageDialog(null,"Recibiendo la orden de READ","Módulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void lectura() {
		JOptionPane.showMessageDialog(null,"Leyendo el dato","Módulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void solicitud() {
		JOptionPane.showMessageDialog(null,"Esperando solicitud del procesador","Módulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void situando() {
		JOptionPane.showMessageDialog(null,"Situando información en el bus de datos","Módulo",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void espera() {
		JOptionPane.showMessageDialog(null,"Esperando nueva operación","Módulo",JOptionPane.PLAIN_MESSAGE);
	} 
}
