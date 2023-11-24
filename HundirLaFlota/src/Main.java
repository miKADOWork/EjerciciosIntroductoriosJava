import javax.swing.JOptionPane;
import java.util.Random;



public class Main {
	  

	public static void main(String[] args) {
		int numFilas = 5;
		int numCol 	 = 5;
		  
		System.out.println("Creando ventana");
		//elegimos la dificultat y luego, cargamos la matriz de juego ya realizada
		String[] listaDificultades = {"Fácil","Medio", "Difícil"};

	    String eligeDificultat = (String) JOptionPane.showInputDialog(null,
	        "Como de dificil quieres que sea", "Elige una opcion", JOptionPane.QUESTION_MESSAGE, null, 
	        listaDificultades,  /* lista de valores*/ listaDificultades[0]);
	    
	    // convertimos la dificultat a un 0 1 o 2 // facil medio dificil respectivamente
	    // para la dificultat facil: 80% (aprox) de barcos 
	    // para la dificultat media: 60% (aprox) de barcos 
	    // para la dificultat dificil: 50% (aprox) de barcos 
	    	// calculamos estos porcentajes:
	    	
	    	
	    	
	    	
	    	// creamos la variable dificultat
	    	long dificultat;
	    	
	    	switch (eligeDificultat) {
			case "Fácil": {
				
				System.out.println("Dificultat: "+listaDificultades[0]);
				dificultat = Math.round(0.8*numFilas*numCol);
				break;
			}
			case "Medio": {
							
				System.out.println("Dificultat: "+listaDificultades[1]);
				dificultat = Math.round(0.6*numFilas*numCol);
				break;
			}
			case "Difícil": {
				
				System.out.println("Dificultat: "+listaDificultades[2]);
				dificultat=  Math.round(0.5*numFilas*numCol);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + eligeDificultat);
			}
	    	
	    	
	    	Window myScreen = new Window(dificultat);
	    	// la dificultat es el numero de barcos que hay que insertar
	    	
			myScreen.setVisible(true);
			
		
	}
	
	

}
