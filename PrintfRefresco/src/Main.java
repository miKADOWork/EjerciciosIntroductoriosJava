import java.util.ArrayList;
public class Main {
	
	public static void Apartado1() {
		// Apartado 1 ----------------------------------------------
				System.out.printf("%s\t%s\t%s\n", "nombre","apellido","segundo_apellido");
				
				// Apartado 2 ----------------------------------------------
				System.out.printf("%s  %s %s\n", "nombre","apellido","segundo_apellido");
				
				// Apartado 3 ----------------------------------------------
				System.out.printf("%3$s\t%2$s\t%1$s\n", "nombre","apellido","segundo_apellido");
				
				// Apartado 4 ----------------------------------------------
				System.out.printf("\"%s  %s\"\n", "","22");
				
				// Apartado 5 ----------------------------------------------
				System.out.printf("\"%010d\"\n",22);
				
				// Apartado 6 ----------------------------------------------
				System.out.printf("\"%010.4f\"\n",17.234233234231);
				
				// Apartado 7 ----------------------------------------------
				System.out.printf("%s\b%s\n","Hola ","Mun\bdo");

	}
	
	
	
	
	
	public static void main(String[] args) {
		Apartado1();
		
		System.out.println("\nApartado2");
		System.out.println("-------------------------------------------------------------------");
		// Clase pelicula
		class Pelicula {
			String titulo = "";
			String anyo = "";
			String director = "";

			public String getTitulo() {
				return titulo;
			}

			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}

			public String getAnyo() {
				return anyo;
			}

			public void setAnyo(String anyo) {
				this.anyo = anyo;
			}

			public String getDirector() {
				return director;
			}

			public void setDirector(String director) {
				this.director = director;
			}

			public Pelicula(String titulo, String anyo, String director) {
				super();
				this.titulo = titulo;
				this.anyo = anyo;
				this.director = director;
			}
			
		}
		
		ArrayList<Pelicula> peliculasList = new ArrayList<Pelicula>();
		// Añadiendo peliculas al arrayList
		peliculasList.add(new Pelicula("Pulp Fiction", "2002", "Tarantino"));
		peliculasList.add(new Pelicula("Kill Bill", "2005", "Tarantino"));
		peliculasList.add(new Pelicula("Rocky", "2007", "Stalonne"));

		System.out.printf("%20s%20s%20s%n", "Nombre ", "Director", "Año");
		System.out.println("\t-----------------------------------------------------------");
		for (Pelicula pelicula : peliculasList) {
			System.out.printf("%20s%20s%20s%n", pelicula.titulo, pelicula.anyo, pelicula.director);
		}

		System.out.printf("%-20s%-20s%-20s%n", "Nombre ", "Director", "Año");
		System.out.println("-----------------------------------------------------------");
		for (Pelicula pelicula : peliculasList) {
			System.out.printf("%-20s%-20s%-20s%n", pelicula.titulo, pelicula.anyo, pelicula.director);
		}
	}

}












		

