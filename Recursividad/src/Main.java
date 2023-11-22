
public class Main {

	public static void main(String[] args) {
		// Apartado 1 
		String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "TS", "SQL", "Java"};
		
		recorreArrayEX1(tecnologies,0);
		
		// Apartado 2
		
		recorreArrayEX2(tecnologies,0,"HTML");
		
		// Apartado 3 
		System.out.println(Fibonacci(20));
		
		// Apartado 4
		String wordToInvert = "Supercalifragilisticoespialidoso";
		System.out.println(invertWord(wordToInvert, 0));
		
		// Apartado 5
		System.out.println(sumDigits(246));
	}
	
	// Funcion apartado 1
	public static void recorreArrayEX1(String [] miArray, int init_poss) {
		if(init_poss == miArray.length) {
			System.out.println("Final alcanzado en este array de length: " + init_poss);
		}
		else {
			System.out.printf("%10s : poss %d\n", miArray[init_poss],init_poss);
			recorreArrayEX1(miArray, ++init_poss);
		}
	}
	
	// Funcion apartado 2
	public static void recorreArrayEX2(String [] miArray, int init_poss, String target) {
		
		if( miArray[init_poss].equals(target) || init_poss == miArray.length) {
			
			if(init_poss == miArray.length) {
				System.out.println("Final alcanzado en este array de length: " + init_poss);
			}
			if(miArray[init_poss].equals(target)){
				System.out.println("Target: <" + target + "> alcanzado en poss:" + init_poss);
			}
		}
		else {
			System.out.printf("%10s : poss %d\n", miArray[init_poss],init_poss);
			recorreArrayEX2(miArray, ++init_poss, target);
		}
	}
	
	// Funcion apartado 3:
	public static int Fibonacci(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
	
	// Función apartado 4:
	public static String invertWord(String palabra, int currentPosition) {
		String toReturn = "";
		
		if(currentPosition == palabra.length()) {
			System.out.println("Hemos recorrido toda la palabra");
			return toReturn;
		}
		
		toReturn = palabra.charAt(currentPosition)+ toReturn;
		
		return  invertWord(palabra, ++currentPosition) + toReturn;
		
	}
	
	// Función apartado 5:
	public static Integer sumDigits(Integer num) {
		Integer sum =0;
		String str_num = num.toString();
		
		sum = Integer.parseInt("" + str_num.charAt(0));
				
		if(str_num.length() == 1) {
			return sum;
		}
		
		// Recortamos el string
		str_num = str_num.substring(1);
		return sum + sumDigits(Integer.parseInt(str_num));
	}
}
