package com.example.demoApp.exceptions;

public class resourceNotFoundException extends RuntimeException {

	String rerourceName;
	String fieldNmae;
	Long fieldValue;
	
	public resourceNotFoundException (String rerourceName,String fieldNmae,long fieldValue) {
		super(String.format("%s not found with %s - %s",rerourceName,fieldNmae,fieldValue));
		
		this.rerourceName = rerourceName;
		this.fieldNmae = fieldNmae;
		this.fieldValue = fieldValue;
		
	}


	
	
}
