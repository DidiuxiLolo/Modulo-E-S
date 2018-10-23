/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DispES;
import javax.swing.JOptionPane;

public class Dispositivos 
{
	
  
	public void recibirRead() {
		JOptionPane.showMessageDialog(null,"Recibiendo la orden de READ","Módulo",JOptionPane.PLAIN_MESSAGE);
	} 
	
	public void lectura() {
		JOptionPane.showMessageDialog(null,"Leyendo el dato","Módulo",JOptionPane.PLAIN_MESSAGE);
	}  
	
	public void situando() {
		JOptionPane.showMessageDialog(null,"Situando información en el bus de datos","Módulo",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void espera() {
		JOptionPane.showMessageDialog(null,"Esperando nueva operación","Módulo",JOptionPane.PLAIN_MESSAGE);
	} 
                
        public void solicitudBusRC() {
		JOptionPane.showMessageDialog(null,"Solicitud de robo de ciclo (BREQ)","Modulo E/S",JOptionPane.WARNING_MESSAGE);
	}
	
	public void accesoMemoria() {
		JOptionPane.showMessageDialog(null,"Accediendo a la memoria","Modulo E/S",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void desactivandoBus() {
		JOptionPane.showMessageDialog(null,"Desactivando la peticion (BREQ)","Modulo E/S",JOptionPane.WARNING_MESSAGE);
	}
        
        public void solicitud() {
		JOptionPane.showMessageDialog(null,"Esperando solicitud del procesador","Modulo E/S",JOptionPane.PLAIN_MESSAGE);
	}
        
        public void datos(){
                JOptionPane.showMessageDialog(null,"Enviando datos","Bus de Datos",JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null,"Datos Enviados","Bus de Datos",JOptionPane.PLAIN_MESSAGE);
        }
        
        public void liberacion(){
                JOptionPane.showMessageDialog(null,"Liberación Exitosa","Bus de Datos",JOptionPane.PLAIN_MESSAGE);
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
	
	
        
    
}       
