import javax.swing.JOptionPane;

public class Dispositivos 
{
	
	public void recibirRead() {
		JOptionPane.showMessageDialog(null,"Recibiendo la orden de READ","M�dulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void lectura() {
		JOptionPane.showMessageDialog(null,"Leyendo el dato","M�dulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void solicitud() {
		JOptionPane.showMessageDialog(null,"Esperando solicitud del procesador","M�dulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void situando() {
		JOptionPane.showMessageDialog(null,"Situando informaci�n en el bus de datos","M�dulo",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void espera() {
		JOptionPane.showMessageDialog(null,"Esperando nueva operaci�n","M�dulo",JOptionPane.PLAIN_MESSAGE);
	} 
}
