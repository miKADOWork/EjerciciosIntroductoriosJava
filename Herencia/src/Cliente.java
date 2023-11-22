
public class Cliente extends Persona{
	String categoria; // tierra aire mar
	String codigo;
	public Cliente(String nombre, String apellido, String documento, String tipo, String categoria) {
		super(nombre,apellido,documento,tipo);
		this.categoria = categoria;
		generateCode();
	}
	
	private void generateCode() {

		System.out.println(this.categoria.toLowerCase());
		if (this.categoria.toLowerCase().equals("tierra")) {
			this.codigo = "TI-2243";
		}
		else if(this.categoria.toLowerCase().equals("aire")){
			this.codigo = "AI-2136";
		}
		else if(this.categoria.toLowerCase().equals("mar")){
			this.codigo = "MA-2134";
		}
		else {
			System.out.println(this.categoria.toLowerCase()+ " no es valido:\n\tERR:No se ha introducido un tipo válido");
		}
	}
}
