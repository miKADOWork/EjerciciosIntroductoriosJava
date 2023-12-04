package com.ejercicioRestControllers.pojo;

public class TextToJSON {
	String message ="";
	
	// constructor 
	public TextToJSON(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
