
public class Main {
	
	public static void lineDraw(String parametresRaw) {

	    // Separamos las instrucciones de la linea
	    String[] instructions = parametresRaw.split(";");

	    for (int numInstruc = 0; numInstruc < instructions.length; numInstruc++) {
	        // separamos en los tres parametros
	        String[] drawOrder = instructions[numInstruc].split(",");
	        
	        int num = Integer.parseInt(drawOrder[1]);
	        String initial_text = (String) drawOrder[0];
	        String final_text = (String) drawOrder[2];
	        
	        System.out.printf("%s%s", initial_text,String.format("%"+ (num)+ "s%s", "",final_text));
	    }
	    // salto a la siguiente linea
	    System.out.println("");
	}

	
	public static void main(String[] args) {
		// Definimos las sequencias de colores
		final String green_col  = "\033[102m";
		final String blue_col   = "\033[104m";
		final String white_col  = "";
		final String yellow_col = "\033[103m";
		final String red_col	= "\033[41m";
		final String black_col  = "\033[40m";
		final String RESET_SEQ  = "\033[0m";
		
		// Creamos una variable para las cabezeras (donde ira el nombre
		// de los paises)
		final String green_header_text  = "\033[1;102m";
		
		// Agregamos las especificaciones al array
		 /*
		 	Cada instrucción la separare por ";" luego, dentro de
		 	una misma instrucción, separarè los 3 parametros por
		 	",". Estos se añadiran al arraylist 
		 	los parametros son:
		 		param1: isAllLine <boolean>
		 		param2: numPossToDraw <int>
		 		param1: color <String>
		 	
		 */
			/* BANDERA DE GRECIA */
			System.out.println(green_header_text + "Bandera de Grecia"+RESET_SEQ +"\n");
			// Para la linea 1:
			lineDraw(blue_col + ",4," + RESET_SEQ + ";"
			+ white_col + ",2," + RESET_SEQ + ";"
			+ blue_col + ",19," + RESET_SEQ);
			
			// Para la linea 2:
			lineDraw(blue_col + ",4," + RESET_SEQ + ";"
					+ white_col + ",2," + RESET_SEQ + ";"
					+ blue_col + ",4," + RESET_SEQ
					+ white_col + ",15," + RESET_SEQ);
			
			// Para la linea 3:
			lineDraw(white_col + ",10," + RESET_SEQ + ";"
					+ blue_col + ",15," + RESET_SEQ);
			
			// Para la linea 4:
			lineDraw(blue_col + ",4," + RESET_SEQ + ";"
					+ white_col + ",2," + RESET_SEQ + ";"
					+ blue_col + ",4," + RESET_SEQ
					+ white_col + ",15," + RESET_SEQ);
			
			// Para la linea 5:
			lineDraw(blue_col + ",4," + RESET_SEQ + ";"
					+ white_col + ",2," + RESET_SEQ + ";"
					+ blue_col + ",19," + RESET_SEQ);
			
			// Para la linea 6:
			lineDraw(white_col + ",25,"+RESET_SEQ);
			
			// Para la linea 7:
			lineDraw(blue_col + ",25,"+RESET_SEQ);
			
			// Para la linea 8:
			lineDraw(white_col + ",25,"+RESET_SEQ);
			
			// Para la linea 9:
			lineDraw(blue_col + ",25,"+RESET_SEQ);
			
			// Para la linea 10:
			lineDraw(white_col + ",25,"+RESET_SEQ);
			System.out.println("\n\n");
			
			/* BANDERA DE UCRANIA */
			System.out.println(green_header_text + "Bandera de Ucrania"+RESET_SEQ +"\n");
			for(int i =0; i<5; i++) {
				lineDraw(blue_col + ",25,"+RESET_SEQ);
			}
			
			for(int i =0; i<5; i++) {
				lineDraw(yellow_col + ",25,"+RESET_SEQ);
			}
			System.out.println("\n\n");
			
			/* BANDERA DE ESPAÑA */
			System.out.println(green_header_text + "Bandera de España"+RESET_SEQ +"\n");
			for(int i =0; i<3; i++) {
				lineDraw(red_col + ",25,"+RESET_SEQ);
			}
			
			for(int i =0; i<3; i++) {
				lineDraw(yellow_col + ",25,"+RESET_SEQ);
			}
			
			for(int i =0; i<3; i++) {
				lineDraw(red_col + ",25,"+RESET_SEQ);
			}
			System.out.println("\n\n");
			
			/* BANDERA DE FRANCIA */
			System.out.println(green_header_text + "Bandera de Francia"+RESET_SEQ +"\n");
			for(int i=0; i<10; i++) {
				lineDraw(blue_col + ",9,"+RESET_SEQ + ";"
						+ white_col + ",9,"+RESET_SEQ + ";"
						+ red_col + ",9,"+RESET_SEQ + ";");
			}
			System.out.println("\n\n");
			
			
			/* BANDERA CATALUÑA */
			System.out.println(green_header_text + "Bandera de Cataluña"+RESET_SEQ +"\n");
			// linea 1:
			lineDraw(yellow_col + ",25,"+RESET_SEQ);
			
			for(int i=0; i<8;i++) {
				if(i%2==0) {
					lineDraw(red_col + ",25,"+RESET_SEQ);
				}
				else {
					lineDraw(yellow_col + ",25,"+RESET_SEQ);
				}
			}
			System.out.println("\n\n");
			
			/* BANDERA DE ALEMANIA */
			System.out.println(green_header_text + "Bandera de Alemania"+RESET_SEQ +"\n");
			for(int i =0; i<3; i++) {
				lineDraw(black_col + ",25,"+RESET_SEQ);
			}
			
			for(int i =0; i<3; i++) {
				lineDraw(red_col + ",25,"+RESET_SEQ);
			}
			
			for(int i =0; i<3; i++) {
				lineDraw(yellow_col + ",25,"+RESET_SEQ);
			}
			System.out.println("\n\n");
			
			/* BANDERA DE JAPON */
			System.out.println(green_header_text + "Bandera de Japon"+RESET_SEQ +"\n");
			lineDraw(white_col + ",25,"+RESET_SEQ);
			lineDraw(white_col + ",25,"+RESET_SEQ);
			// Dibujamos el circulo
			lineDraw(white_col + ",11,"+RESET_SEQ + ";"
					+ red_col + ",2,"+RESET_SEQ + ";"
					+ white_col + ",12,"+RESET_SEQ + ";");
			
			lineDraw(white_col + ",10,"+RESET_SEQ + ";"
					+ red_col + ",4,"+RESET_SEQ + ";"
					+ white_col + ",14,"+RESET_SEQ + ";");
			lineDraw(white_col + ",9,"+RESET_SEQ + ";"
					+ red_col + ",6,"+RESET_SEQ + ";"
					+ white_col + ",9,"+RESET_SEQ + ";");
			lineDraw(white_col + ",8,"+RESET_SEQ + ";"
					+ red_col + ",8,"+RESET_SEQ + ";"
					+ white_col + ",12,"+RESET_SEQ + ";");
			lineDraw(white_col + ",7,"+RESET_SEQ + ";"
					+ red_col + ",10,"+RESET_SEQ + ";"
					+ white_col + ",12,"+RESET_SEQ + ";");
			lineDraw(white_col + ",8,"+RESET_SEQ + ";"
					+ red_col + ",8,"+RESET_SEQ + ";"
					+ white_col + ",12,"+RESET_SEQ + ";");
			
			lineDraw(white_col + ",9,"+RESET_SEQ + ";"
					+ red_col + ",6,"+RESET_SEQ + ";"
					+ white_col + ",9,"+RESET_SEQ + ";");
			
			lineDraw(white_col + ",10,"+RESET_SEQ + ";"
					+ red_col + ",4,"+RESET_SEQ + ";"
					+ white_col + ",12,"+RESET_SEQ + ";");
			
			lineDraw(white_col + ",11,"+RESET_SEQ + ";"
					+ red_col + ",2,"+RESET_SEQ + ";"
					+ white_col + ",12,"+RESET_SEQ + ";");
			
			
			lineDraw(white_col + ",25,"+RESET_SEQ);
			lineDraw(white_col + ",25,"+RESET_SEQ);
	}
}


