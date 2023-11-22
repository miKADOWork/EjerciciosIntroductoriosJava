
public class Alumno implements Inter_Persona{

String nombre;
String curso;

public Alumno(String nombre, String curso) {
	this.nombre = nombre;
	this.curso = curso;
}

@Override
public String getName() {
	return this.nombre;
}

public String getSalary() {
	return this.curso;
}

@Override
public void setName(String nombre){
	this.nombre = nombre;
}

public void setSalary(String curso){
	this.curso = curso;
}



}
