import javax.swing.JOptionPane;

public class Controlador {
	
	
	
	public static void main(String[] args) {
		String [] entrada = {"E/S programada","E/S por interrupción","E/S por DMA"};
		String [] dma = {"Transparente","Robo de ciclo","Ráfaga"};
		
		JOptionPane.showMessageDialog(null,"Módulo de Entrada y Salida","Bienvenido",JOptionPane.PLAIN_MESSAGE);
		String a = (String) JOptionPane.showInputDialog(null,"Seleccione una", "Entrada y Salida",JOptionPane.QUESTION_MESSAGE,null,entrada, entrada[0]);
		int a1 = Integer.parseInt(a);
		switch(a1) {
			case 1:
				break;
			case 2:
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
			
				
	}
}
