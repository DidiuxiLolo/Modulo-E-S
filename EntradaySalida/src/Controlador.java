import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class Controlador {
	
	
	
	public static void main(String[] args) {
		String [] entrada = {"E/S programada","E/S por interrupci�n","E/S por DMA"};
		String [] dma = {"Transparente","Robo de ciclo","R�faga"};
		
		Microprocesador cpu = new Microprocesador();
		
		
		JOptionPane.showMessageDialog(null,"M�dulo de Entrada y Salida","Bienvenido",JOptionPane.PLAIN_MESSAGE);
		String a = (String) JOptionPane.showInputDialog(null,"Seleccione una", "Entrada y Salida",JOptionPane.QUESTION_MESSAGE,null,entrada, entrada[0]);
		
		if(a.equalsIgnoreCase("E/S programada")) {
		}
		if(a.equalsIgnoreCase("E/S por interrupci�n")) {
			cpu.correrPrograma();
			JOptionPane.showMessageDialog(null,"Se insert� un dispositivo: ","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			cpu.mandarRead();
			cpu.guardarDatos();
			cpu.lecturaDatos();
			cpu.seguirPrograma();
		}
		if(a.equalsIgnoreCase("E/S por DMA")) {
			String dm = (String) JOptionPane.showInputDialog(null,"Seleccione una", "E/S por DMA",JOptionPane.QUESTION_MESSAGE,null,dma, dma[0]);
			if(dm.equalsIgnoreCase("Transparente")) {
				cpu.correrPrograma();
				cpu.ejecutarInstrucciones();
				cpu.solicitudDMA();
				cpu.renunciaBus();
				cpu.siguiendoPrograma();
			}
			if(dm.equalsIgnoreCase("Robo de ciclo")) {
				cpu.correrPrograma();
				cpu.usoBus();
				cpu.aceptacion();
				cpu.desactivaci�n();
			}
			if(dm.equalsIgnoreCase("R�faga")) {
				cpu.correrPrograma();
                cpu.solicitudRABus();
                cpu.aceptacion();
                cpu.transferenciaBloques();                    
                cpu.libertad(); 
			}
		}		
				
	}
}
