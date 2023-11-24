
public class Juego {
	
	int tamanyoTableroX = 5;
	int tamanyoTableroY = 5;
	// este codigo quiere ser reutilizado para el buscaminas
	// true <==> mina // false <==> no mina
	boolean[][] arrayJuego = new boolean[tamanyoTableroX][tamanyoTableroY];
	
	//Necesitaremos una funcion que distribuia de forma aleatoria las minas
	public Juego(int dificultat) {
		// cuenta cuantos barcos hemos puesto ya
		int contador =0;
		for(int i=0;i<tamanyoTableroX; i++) {
			for(int j=0; j<tamanyoTableroY; j++) {
				if(Math.round(Math.random()*2)== 1) {
					this.arrayJuego[i][j] = false;	
				}
				else {
					this.arrayJuego[i][j] = true;
				}
				
			}
			
		}
		
	}
	
	
}
