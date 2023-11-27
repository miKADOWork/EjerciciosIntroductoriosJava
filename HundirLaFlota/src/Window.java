import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
// Eventos 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane ;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.Dimension; // usado para fijar tamaño de los botones

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	int contTirada =0;
	long dificultat;
	int contadorAcertados =10;
	
	public Window(long dificultat){
		// añadimos la partida
		Juego partida = new Juego(dificultat);
		
		// añadimos el margin	
		setTitle("Juego de Undir la Flota");
		setSize(400, 900);
		setResizable(false);
		
		int numFilas = 5;
		int numColumnas =5;
		int gapVertical =8;
		int gapHorizontal =8;
		int totalPossicionesGrid = (int) numFilas*numColumnas;
		
			
		// creamos el textarea que sera la terminal
		JTextArea textArea = new JTextArea();
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.BLACK);
        textArea.setEditable(false);
        
        
       
        
        // Añadimos el texto inicial al JTextArea
        textArea.append("Juego iniciado: pulsa en la casilla que quieras\n");
		
		
		GridLayout gridPosiciones = new GridLayout(1, numColumnas+1, gapVertical,gapHorizontal);
		GridLayout gridCentral = new GridLayout(numFilas+1, numColumnas, gapVertical,gapHorizontal); 
		GridLayout gridSuperior = new GridLayout(2, 0, gapVertical,gapHorizontal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		// Cremos un JLabel un JPanel y un espacio para ver la terminal
		JLabel titulo = new JLabel("Este es el juego de undir la flota",SwingConstants.CENTER);
		JPanel panelSuperior = new JPanel(gridSuperior);
		panelSuperior.setBorder(new EmptyBorder(60, 10, 30, 20));
		JPanel panelCentral = new JPanel(gridCentral); 
		// añadimos un margen
		panelCentral.setBorder(new EmptyBorder(10, 10, 20, 20));
		JPanel panelInferior = new JPanel(gridCentral);
		// modificamos los valores del JPanel para que sea:
			/*
			 * Negro
			 * tenga barra de navegación 
			 * Se pueda añadir texto
			 * 
			 */
		panelInferior.setBackground(Color.BLACK);
		//panelInferior.setSize(150,400);
		panelInferior.setBorder(new EmptyBorder(10, 10, 20, 20));
		
		
		JButton[][] tablero = new JButton[numFilas][numColumnas];
		
		// añadimos el titulo
		panelSuperior.add(titulo);
		
		// creamos un label array:
		JLabel[] posicionesX = new JLabel[numFilas];
		JLabel[] posicionesY = new JLabel[numColumnas];
		
		for(int k=0;k<numFilas;k++) {
			JLabel possicion = new JLabel(""+(k+1), SwingConstants.CENTER);
			posicionesX[k] = possicion;
			posicionesY[k] = possicion;
		}
		
		// Imagen 
		Image img;
		
		// Creamos todos los botones botones
		for(int i=0; i< numFilas;i++) {
			panelCentral.add(posicionesX[i]);
			for (int j=0; j<numColumnas;j++) {
				JButton boton_aux = new JButton();

				boton_aux.setPreferredSize(new Dimension(30, 30));
				panelCentral.add(boton_aux);
				tablero[i][j] = boton_aux;
				// Guardamos las posiciones x e y en variables finales
		        final int x = i;
		        final int y = j;
		        
		        
		        try {
		            img = ImageIO.read(Main.class.getResource("mar.jpeg"));
		            ImageIcon nuevoIcono = new ImageIcon(img);
		            boton_aux.setIcon(nuevoIcono);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        tablero[i][j].addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                System.out.println("Has pulsado en la posición: (" + x + ", " + y + ")");
		                textArea.append("\t" + (contTirada + 1) + ". Disparo en la posición: (" + x + ", " + y + ")\n");
		                
		                // Incrementamos la tirada actual
		                contTirada++;
		                
		                
		                // Cambiamos la imagen en el botón actual
		                try {
		                	String texto;
//							// comprovamos si hemos dado en el blanco o no:
		                	if (partida.arrayJuego[x][y] == false){ // no le hemos dado
		                		Image icono = ImageIO.read(Main.class.getResource("fallo.jpeg"));
		                		tablero[x][y].setIcon(new ImageIcon(icono));
		                		texto = "\t\tFallo\n";
		                	}
		                	else { // impacto
		                		Image icono = ImageIO.read(Main.class.getResource("tocado.jpg"));
		                		tablero[x][y].setIcon(new ImageIcon(icono));
		                		texto = "\t\tTocado\n";
		                		contadorAcertados++;
		                		System.out.println("num Barcos alcanzados: "+ contadorAcertados +"\nBarcos totales: "+dificultat);
		                	}
		                	
		                	textArea.append(texto);
		                	int indice_ultima_linea = textArea.getDocument().getLength(); //retorna el numero de lineas
		                	textArea.setCaretPosition(indice_ultima_linea); //ubica el cursor al final

		                	
		                } catch (IOException ex) {
		                    ex.printStackTrace();
		                }
		                
		                tablero[x][y].setEnabled(false);
		                
		                // Cerramos el juego si hemos jugado todos las tiradas
		                if (contTirada == numFilas * numColumnas) {
		                    textArea.append("El juego se ha terminado, felicidades\n");
		                    
		                    // añadir un  alert de que se ha acabado el juego
		                    JOptionPane.showMessageDialog(null,"Se ha acabado la municón", "Felicidades:", 3);
		                    System.exit(0);
		                }
		                
		                // Miramos si hemos pulsado todos los barcos
		                if(partida.getContador() == contadorAcertados) {
		                	textArea.append("El juego se ha temrinado, has undido todos los barcos\n");
		                	JOptionPane.showMessageDialog(null,"Te lo has pasado", "Felicidades:", 3);
		                	System.exit(0);
		                }
		            }
		        });

		        
		        // Cerramos el juego si hemos jugado todos las tiradas
                if(contTirada == numFilas*numColumnas) {
                	textArea.append("El juego se ha temrinado, felicidades\n");
                }
                
                
				if(j == numColumnas && i==numFilas-1) {
					for(int k=0;k<numFilas;k++) {
						JLabel possicion = new JLabel(""+(k+1),SwingConstants.CENTER);
						panelCentral.add(posicionesY[k]);
					}
				}
			}
		}
		
		
		// añadimos un label (espacio) vacio 
		panelCentral.add(new JLabel(""));
		
		// Añadimos la linea final
		for(int k=0;k<numColumnas;k++) {
			JLabel possicion = new JLabel(""+(k+1),SwingConstants.CENTER);
			panelCentral.add(possicion);
		}
		
		// creamos el jscroll y añadiremos el panel inferior a este
		JScrollPane scrollPanelInferior = new JScrollPane(panelInferior);
		scrollPanelInferior.setBorder(new EmptyBorder(20, 20, 20, 20));
		scrollPanelInferior.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPanelInferior.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		
		
		
		// ajusta el tamanyo de todos los componentes para que quepan
		
		 
		// añadimos los botones 
		
		
		// Sección de la terminal
        
        
        // actualizando el tamanyo cada vez que se añada algo podria funcionar
        //panelInferior.setPreferredSize(new Dimension(300, 2000));
        
        panelInferior.setLayout(new BorderLayout());
        panelInferior.add(textArea, BorderLayout.CENTER);
        
        scrollPanelInferior.setPreferredSize(new Dimension(300, 200));

        
        
		
		// añadimos los componentes
		
		//añadimos los paneles
		setLayout(new BorderLayout());
		add(panelSuperior, BorderLayout.NORTH);
		add(panelCentral, BorderLayout.CENTER);
		add(scrollPanelInferior, BorderLayout.SOUTH);
		pack();
		setSize(400, 900);
		
	}
	
	

}
