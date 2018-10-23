package DispES;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ControladorES {

    public static void main(String[] args) {
        
		String [] entrada = {"E/S programada","E/S por interrupción","E/S por DMA"};
		String [] dma = {"Transparente","Robo de ciclo","Ráfaga"};
                
                Microprocesador cpu = new Microprocesador();
		
		JOptionPane.showMessageDialog(null,"Módulo de Entrada y Salida","Bienvenido",JOptionPane.PLAIN_MESSAGE);
		String a = (String) JOptionPane.showInputDialog(null,"Seleccione una", "Entrada y Salida",JOptionPane.QUESTION_MESSAGE,null,entrada, entrada[0]);
		
                if(a.equalsIgnoreCase("E/S programada")){
                    // 1° Corre el programa 
                    cpu.correrPrograma();
                    // 2° Se inserta un dispositivo
                    JOptionPane.showMessageDialog(null,"Se insertó un dispositivo: ","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    // 3° Comprobacion de estado dispositivo 
                    cpu.comprobacionEstado();
                    // 4° El procesador lee el dispositivo
                    cpu.leerDatosDisp();
                    // 5° Procesador espera a que la op concluya.
                    cpu.espera();
                    // 6° Leer dato del E/S
                    // 7° Se escribe el dato en la memoria
                    cpu.lecturaDatos();
                    
                }
                if(a.equalsIgnoreCase("E/S por interrupción")){
                    cpu.correrPrograma();
                    JOptionPane.showMessageDialog(null,"Se insertó un dispositivo: ","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    cpu.mandarRead();
                    cpu.guardarDatos();
                    cpu.lecturaDatos();
                    cpu.seguirPrograma();
                }
                if(a.equalsIgnoreCase("E/S por DMA")){
                    String dm = (String) JOptionPane.showInputDialog(null,"Seleccione una", "E/S por DMA",JOptionPane.QUESTION_MESSAGE,null,dma, dma[0]);

                    if(dm.equalsIgnoreCase("Transparente")){
                        cpu.correrPrograma();
			cpu.ejecutarInstrucciones();
			cpu.solicitudDMA();
			cpu.renunciaBus();
                        cpu.siguiendoPrograma();
                    }
                    if(dm.equalsIgnoreCase("Robo de ciclo")){
                        cpu.correrPrograma();
			cpu.usoBus();
			cpu.aceptacion();
			cpu.desactivacion();
                    } 
                    if(dm.equalsIgnoreCase("Ráfaga")){
                        // 1° Corre el programa
                            cpu.correrPrograma();
                        // 2° El DMAC solicita el control del bus al CPU
                            cpu.solicitudRABus();
                        // 3° Cpu concede el bus
                            cpu.aceptacion();
                        // 4° Inicia transferencia de bloque de datos
                        // 5° Finaliza la transferencia    
                            cpu.transferenciaBloques();                    
                        // 6° DMAC libera al bus
                            cpu.libertad();
                        // 7° El programa sigue
                            
                    }
                }
}}                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                /*switch(a1) {
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
		}*/
 

