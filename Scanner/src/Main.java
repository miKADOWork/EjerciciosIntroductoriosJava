import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.InputStream;

public class Main {
	public static boolean someoneWin(String[][] tablero_array) {
		int counter=0;
		
		// buscamos las possiciones en la primera fila y la primera columna a buscar
		
		
		return false;
	}

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		
		boolean isGameRunning = true;
		System.out.println("1. Humano contra humano");
		System.out.println("2. Humano contra CPU (CPU juega O)");
		System.out.println("3. CPU contra CPU");
		System.out.println("Elige una de las 3 opciones");
		int opcion = sc.nextInt();
		System.out.println("Empieza el juego");
		
		// creamos el array del juego
		String [][] tablero = new String[3][3];
		
		// lo llenamos de espacios para que quede bonito
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				tablero[i][j] = " ";
			}
		}
		
		// Bucle de juego
		while(isGameRunning) {
			// Jugada
			System.out.println("Introduce la la posicion x,y");
			String possicion = sc.next();
			
			// convertimos el string a x e y:
			// Define a regular expression pattern to capture two groups of digits
	        Pattern pattern = Pattern.compile("[\\s?\\(]+(\\d+)[\\s?,]+(\\d+)");

	        // Create a matcher for the input string
	        Matcher matcher = pattern.matcher(possicion);

	        // Variables to store the matched groups
	        int x = 0;
	        int y = 0;

	        // Check if the pattern is found in the input string
	        if (matcher.find()) {
	            // Extract the matched groups
	            x = Integer.parseInt(matcher.group(1));
	            y = Integer.parseInt(matcher.group(2));
	        }
	        
			// Validación de Tirada
				// possicion ocupada repetimos la tirada
				if(!tablero[x][y].equals(" ")) {
					System.out.println("Introduce la la posicion x,y");
					
				}
				else {
					tablero[x][y] = "X";
				}
				
				
				//
				
			
			// Impresion de la tirada
			System.out.printf("|   | 1 | 2 | 3 |\n");
			System.out.printf("| 1  | %s | %s | %s |\n",tablero[0][0], tablero[0][1], tablero[0][2]);
			System.out.printf("| 2  | %s | %s | %s |\n",tablero[1][0], tablero[1][1], tablero[1][2]);
			System.out.printf("| 3  | %s | %s | %s |\n",tablero[2][0], tablero[2][1], tablero[2][2]);
			
			
			// Juego sigue?
			if(!isGameRunning) {
				System.out.println("El juego ha acabado");
				
			}
		}
	}

}
