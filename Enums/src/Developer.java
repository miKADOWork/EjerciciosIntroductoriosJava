

public class Developer {
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    private String roll_dev;

    // Constructor
    public Developer(String nombre, String apellido, int edad, String DNI, String roll_dev) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.roll_dev = roll_dev;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getRoll_dev() {
        return roll_dev;
    }

    public void setRoll_dev(String roll_dev) {
        this.roll_dev = roll_dev;
    }
	}

