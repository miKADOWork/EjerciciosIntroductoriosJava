import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Developer Manel = new Developer("Manel", "Galvez", 23, "toyako", Profesiones.FRONT_END_DEVELOPER.displayName());
		Developer Fer = new Developer("Fer", "Galvez", 23, "toyako", Profesiones.BACK_END_DEVELOPER.displayName());
		Developer Raul = new Developer("Raul", "Galvez", 23, "toyako", Profesiones.FULL_STACK_DEVELOPER.displayName());
		
		// creamos un array con todos los empleados
		Developer[] empleados = {Manel, Fer, Raul};
		
		
		// Imprimimos su roll de desarroyador
		System.out.println(Manel.getRoll_dev());
		System.out.println(Fer.getRoll_dev());
		System.out.println(Raul.getRoll_dev());
		
		//Comprovamos los que son fullstack o son front
		for (int i =0; i< empleados.length; i++) {
			if(empleados[i].getRoll_dev().equals(Profesiones.BACK_END_DEVELOPER.displayName())){
				System.out.println(empleados[i].getNombre() + " es un "+Profesiones.BACK_END_DEVELOPER.displayName() + " pobrete");
			}
			else {
				System.out.println(empleados[i].getNombre() + " es un "+ empleados[i].getRoll_dev() + ", viva el vino");
			}
		}
	
	}

}
