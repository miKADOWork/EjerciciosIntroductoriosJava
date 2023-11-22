
public class Profesor implements Inter_Persona{
	String nombre;
	float salario;
	
	public Profesor(String nombre, float salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	@Override
	public String getName() {
		return this.nombre;
	}
	
	public float getSalary() {
		return this.salario;
	}
	
	@Override
	public void setName(String nombre){
		this.nombre = nombre;
	}
	
	public void setSalary(float sueldo){
		this.salario = sueldo;
	}
}

