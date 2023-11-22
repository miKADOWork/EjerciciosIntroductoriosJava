
public enum Profesiones {
	FRONT_END_DEVELOPER("Front End Developer"),
    BACK_END_DEVELOPER("Back End Developer"),
    FULL_STACK_DEVELOPER("Full Stack Developer");
	
	private String displayName;
	
	Profesiones(String displayName){
		this.displayName = displayName;
	}
	
	public String displayName() { 
		return displayName; 
	}
}


