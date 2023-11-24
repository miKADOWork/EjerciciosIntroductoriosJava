import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane ;

public class Main {

	public static void main(String[] args) {
		String value_input;
		
		// Muestra el mensaje del precio con IVA
		JOptionPane.showMessageDialog(null, "El total es:\n\t120 EUR (sin IVA)\n\t133 EUR (con IVA)", "Factura",3);
		value_input = JOptionPane.showInputDialog("Como te llamas?");
		System.out.println("Valor introducido: "+value_input);
		
		
		
		if(value_input == null){ // se ha cerrado el banner
			JOptionPane.showMessageDialog(null,"No se ha introducido nada", "Error: banner cerrado",0);
			// se que no es buena idea esto pero quiero practicar el llamar a main dentro de main
			Main.main(args);
		}
		else { // el nombre es correcto y se ha pulsado el voton de ok
			if(value_input.equals("")) {
				JOptionPane.showMessageDialog(null,"El nombre introducido no es valido", "Error: nombre vacio",0);
				// se que no es buena idea esto pero quiero practicar el llamar a main dentro de main
				Main.main(args);
			}
			else {
				JOptionPane.showMessageDialog(null,"El nombre introducido:\n\t"+value_input, "Factura",3);
			}
		}
		
	
		// Apartado 2
		boolean isStillRunning = true;
		
		while(isStillRunning) {
			value_input = null; // reseteamos los valores previos
			value_input = JOptionPane.showInputDialog("Introduce un num del -1 al 3 (incuidos):"
					+ "\t-1. Sin icono\n"
					+ "\t 0. Error\n"
					+ "\t 1. Información\n"
					+ "\t 2. Alerta\n"
					+ "\t 3. Pregunta\n"
					+ "\nIntrduce \"exit\" para salir");
			
			if (value_input != null && value_input.toLowerCase().equals("exit")) {
				isStillRunning = false;
			}
			else {
				if(value_input==null) { //cerramos el banner
					isStillRunning = false;
				}
				else {
					try {
						if (Integer.parseInt(value_input) >3 && Integer.parseInt(value_input)< -1) {
							JOptionPane.showMessageDialog(null,"Numero fuera de rango", "Error:", 0);
						}
						
						JOptionPane.showMessageDialog(null,"tipo elegido", "tipo elegido", Integer.parseInt(value_input));
						isStillRunning = false; //salimos del bucler
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null,"Formato no valido", "Error:", 0);
					}
				}
			}
		}
		
		
		// Apartado 3 
		String[] listaAnimales = {"Lobo","Perro", "Gato", "Caballo", "Pez Globo"};
		
	    String eligeAnimal = (String) JOptionPane.showInputDialog(null,
	        "Que animal te gusta mas", "Elige el animal que prefieras", JOptionPane.QUESTION_MESSAGE, null, 
	        listaAnimales,  /* lista de valores*/ listaAnimales[3]); // valor por defecto

	    
	    // Vemos que animal hemos elegido
	    String route ="";
	    switch (eligeAnimal) {
	    case "Lobo":
	    	route = "src/perro.jpeg";
	    	break;
        case "Perro":
        	route = "src/perro.png";
            break;
        case "Gato":
        	route = "src/gato.jpg";
            break;
        case "Caballo":
        	route = "src/caballo.jpeg";
            break;
        case "Pez Globo":
        	route = "src/pezGlobo.jpeg";
            break;
        default:
            System.out.println("Animal no reconocido");
    }
	    
	    ImageIcon animalFoto = new ImageIcon(route);
	    Image img = animalFoto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	    
	    
	JOptionPane.showMessageDialog(null,"El animal favorito es:\n\t"+eligeAnimal, "Animales",2,new ImageIcon(img));
	    
	    // Apartado 4
	    Object[] options = {"Preferido", "No Preferido","Pizza"};
	    
	    int valueInputOther = JOptionPane.showOptionDialog(null, "¿Que te gusta mas?", "Pregunta tonta:",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Check the user's choice
        if (valueInputOther == 0) {
            System.out.println("El usuario eligió 'Preferido'.");
        } else if (valueInputOther == 1) {
            System.out.println("El usuario eligió 'No Preferido'.");
        }
        else if (valueInputOther == 2) {
            System.out.println("El usuario eligió 'Pizza'.");
        } else if (valueInputOther == JOptionPane.CANCEL_OPTION || valueInputOther == JOptionPane.CLOSED_OPTION) {
            System.out.println("El usuario cerró el diálogo o eligió 'Cancelar'.");
        }
	}
}
