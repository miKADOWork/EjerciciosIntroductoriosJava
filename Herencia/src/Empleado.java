
public class Empleado extends Persona{
	
	String tipoContrato; // Junior o Senior
	float sueldo;
	
	public Empleado(String nombre, String apellido, String documento, String tipo, String tipoContrato) {
		super(nombre,apellido,documento,tipo);
		this.tipoContrato = tipoContrato;
		calcularSueldo();
	}
	
	private void calcularSueldo() {
		if (this.tipoContrato.toLowerCase().equals("junior") ) {
			this.sueldo = (float) 18000.50;
		}
		else if(this.tipoContrato.toLowerCase().equals("senior")){
			this.sueldo = (float) 30000.50;
		}
		else {
			System.out.println(this.tipoContrato.toLowerCase() + " no es valido:\n\tERR:No se ha introducido un tipo válido");
		}
		
	}
	
}
