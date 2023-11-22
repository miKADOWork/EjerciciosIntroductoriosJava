
public class Main {

	public static void main(String[] args) {
		System.out.println("Clase programador");
		Trabajador David = new Trabajador((float)23000.3);
		System.out.println(David.salario);
		System.out.println("Clase programador extiende Trabajador");
		Programador Mikel = new Programador((float)23000.3, 23);
		System.out.println(Mikel.salario);
		System.out.println(Mikel.bonus);
		System.out.println("----------------------------------------------");
		System.out.println("Clase Persona");
		Persona Manel = new Persona ("Manel", "Carajillo", "129328319Z","junior");
		System.out.println(Manel);
		System.out.println("Clases hijas:");
		System.out.println("Clase Cliente:\nClase Empleado");
		Cliente Jose = new Cliente ("Jose", "Ochoa", "2348319Z","cliente","Tierra");
		System.out.println(Jose);
		System.out.println(Jose.codigo);
		Empleado Araceli = new Empleado ("Jose", "Ochoa", "2348319Z","empleado","jUnior");
		System.out.println(Araceli);
		System.out.println(Araceli.sueldo);
	}

}
