
public class Juego {
	
	int tamanyoTableroX = 5;
	int tamanyoTableroY = 5;
	// este codigo quiere ser reutilizado para el buscaminas
	// true <==> barco/mina // false <==> no barcono mina
	boolean[][] arrayJuego = new boolean[tamanyoTableroX][tamanyoTableroY];
	int contador =0;
	
	//Necesitaremos una funcion que distribuia de forma aleatoria las minas
	public Juego(long dificultat) {
		// cuenta cuantos barcos hemos puesto ya
		
		
		System.out.println(dificultat);
		for(int i=0;i<tamanyoTableroX; i++) {
			for(int j=0; j<tamanyoTableroY; j++) {
				// como es equiprovable random, me dara aproximadamente el nivel de dificultat que quiero
				//if(Math.round(Math.random()*tamanyoTableroY*tamanyoTableroX) < dificultat) {
				if(Math.round(Math.random()*tamanyoTableroX*tamanyoTableroY) < dificultat) {
					this.arrayJuego[i][j] = false;	
				}
				else {
					this.arrayJuego[i][j] = true;
					contador++;
				}
				
			}
			
		}
		
	}
	
	// Devuelve el numero de possiciones con barcos
	public int getContador() {
		return this.contador;
	}
	
	
}
