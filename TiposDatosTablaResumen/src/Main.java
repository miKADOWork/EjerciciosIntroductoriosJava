
public class Main {
	
	public static void drawEntry(String datatype, String format) {
		// Calculamos la longitud de la palabra "double"
		int length_double = "double".length();
		int length_double_max_val = ("" + Double.MAX_VALUE).length();
		int length_of_type = datatype.length();
		double min_value,max_value;
		
		// Guardamos el maximo valor y el minimo
		// Guardamos el maximo valor y el minimo
		
		switch (datatype) {
		    case "byte":
		    	max_value = Byte.MAX_VALUE;
		    	min_value = Byte.MIN_VALUE;
		        break;
		    case "short":
		        max_value = Short.MAX_VALUE;
		        min_value = Short.MIN_VALUE;
		        break;
		    case "int":
		        max_value = Integer.MAX_VALUE;
		        min_value = Integer.MIN_VALUE;
		        break;
		    case "long":
		        max_value = Long.MAX_VALUE;
		        min_value = Long.MIN_VALUE;
		        break;
		    case "float":
		        max_value = Float.MAX_VALUE;
		        min_value = Float.MIN_VALUE;
		        break;
		    case "double":
		     
		    	max_value = Double.MAX_VALUE;
		        min_value = Double.MIN_VALUE;
		        break;
		        
		    default:
		    	System.out.println("Error en la key");
		        throw new IllegalArgumentException("Unexpected value: " + datatype);
		}

		
		System.out.printf("\n");
		System.out.printf("  \t%s "+"\033[0m\n","\033[1;102m" 
				+  "Typeof:" + format + datatype);
		System.out.printf("  \t" + "%s",
				"\033[1;33;44m"+"   Tamaños:   "+"\033[0m"+ "\n");
		System.out.printf("  \t" + "\033[1;103m"+"%s","\033[1;33m"+"  min:"+"\033[0m"+ " " + min_value + "\n");
		System.out.printf("  \t" + "\033[1;41m"+"%s","\033[1;33m"+"  max:"+"\033[0m"+ " " + max_value + "\n");
		System.out.printf("\n");
	}

	public static void main(String[] args) {
		// Colores de texto con negrita----------
		final String green_bold  = "\033[1;102m";
		final String blue_bold   = "\033[1;104m";
		final String white_bold  = "\033[1m";
		final String yellow_bold = "\033[1;103m";
		final String red_bold	 = "\033[1;41m";
		final String black_bold  = "\033[1;40m";
		final String RESET_SEQ   = "\033[0m";
		
		drawEntry("byte", blue_bold);
		drawEntry("short", blue_bold);
		drawEntry("int", blue_bold);
		drawEntry("long", blue_bold);
		drawEntry("float", blue_bold);
		drawEntry("double", blue_bold);
		
	}
}
