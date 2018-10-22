import javax.swing.JOptionPane;

public class Dispositivos 
{
	
	public void recibirRead() {
		JOptionPane.showMessageDialog(null,"Recibiendo la orden de READ","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void lectura() {
		JOptionPane.showMessageDialog(null,"Leyendo el dato","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void solicitud() {
		JOptionPane.showMessageDialog(null,"Esperando solicitud del procesador","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void situando() {
		JOptionPane.showMessageDialog(null,"Situando información en el bus de datos","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void espera() {
		JOptionPane.showMessageDialog(null,"Esperando nueva operación","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void solicitudBusRc() {
		JOptionPane.showMessageDialog(null,"Solicitud de robo de ciclo (BREQ)","Módulo E/S",JOptionPane.WARNING_MESSAGE);
	}
	
	public void accesoMemoria() {
		JOptionPane.showMessageDialog(null,"Accediendo a la memoria","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void desactivandoBus() {
		JOptionPane.showMessageDialog(null,"Desactivando la petición (BREQ)","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void mandarInstrucciones() {
		JOptionPane.showMessageDialog(null,"Mandando instrucciones","Módulo E/S",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void transmitirDMA() {
		JOptionPane.showMessageDialog(null,"Listo para transmitir","DMA",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void transferenciaDMA() {
		JOptionPane.showMessageDialog(null,"Transmitiendo a memoria","DMA",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Transferencia completa","DMA",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Renunciando al control del bus","DMA",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void datos() {
		JOptionPane.showMessageDialog(null,"Enviando datos","Bus de Datos",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Datos Enviados","Bus de Datos",JOptionPane.PLAIN_MESSAGE);
	}
        
    public void liberacion(){
    	JOptionPane.showMessageDialog(null,"Liberación Exitosa","Bus de Datos",JOptionPane.PLAIN_MESSAGE);
    }
}
