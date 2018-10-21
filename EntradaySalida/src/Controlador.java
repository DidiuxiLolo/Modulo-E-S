import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class Controlador {
	
	
	
	public static void main(String[] args) {
		String [] entrada = {"E/S programada","E/S por interrupción","E/S por DMA"};
		String [] dma = {"Transparente","Robo de ciclo","Ráfaga"};
		
		Microprocesador cpu = new Microprocesador();
		
		
		JOptionPane.showMessageDialog(null,"Módulo de Entrada y Salida","Bienvenido",JOptionPane.PLAIN_MESSAGE);
		String a = (String) JOptionPane.showInputDialog(null,"Seleccione una", "Entrada y Salida",JOptionPane.QUESTION_MESSAGE,null,entrada, entrada[0]);
		
		if(a.equalsIgnoreCase("E/S programada")) {
		}
		if(a.equalsIgnoreCase("E/S por interrupción")) {
			cpu.correrPrograma();
			JOptionPane.showMessageDialog(null,"Se insertó un dispositivo: ","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			cpu.mandarRead();
			cpu.guardarDatos();
			cpu.lecturaDatos();
			cpu.seguirPrograma();
		}
		if(a.equalsIgnoreCase("E/S por DMA")) {
			String dm = (String) JOptionPane.showInputDialog(null,"Seleccione una", "E/S por DMA",JOptionPane.QUESTION_MESSAGE,null,dma, dma[0]);
			if(dm.equalsIgnoreCase("Transparente")) {
				
			}
			if(a.equalsIgnoreCase("Robo de ciclo")) {
				
			}
			if(a.equalsIgnoreCase("Ráfaga")) {
				
			}
		}
		/*switch(a1) {
			case 1:
				
				break;
			case 2:
				cpu.mandarRead();
				break;
			case 3:
				String dm = (String) JOptionPane.showInputDialog(null,"Seleccione una", "E/S por DMA",JOptionPane.QUESTION_MESSAGE,null,dma, dma[0]);
				int dm1 = Integer.parseInt(dm);
				switch(dm1)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						
						break;
				}
				break;
		}
		*/
			
				
	}
}
