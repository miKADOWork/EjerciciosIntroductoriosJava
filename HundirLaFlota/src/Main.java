import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creando ventana");
		//elegimos la dificultat y luego, cargamos la matriz de juego ya realizada
		String[] listaDificultades = {"Fácil","Medio", "Difícil"};

	    String eligeDificultat = (String) JOptionPane.showInputDialog(null,
	        "Como de dificil quieres que sea", "Elige una opcion", JOptionPane.QUESTION_MESSAGE, null, 
	        listaDificultades,  /* lista de valores*/ listaDificultades[0]);
	    
	    // convertimos la dificultat a un 0 1 o 2 // facil medio dificil respectivamente
		
		Window myScreen = new Window();
		myScreen.setVisible(true);
	}

}
