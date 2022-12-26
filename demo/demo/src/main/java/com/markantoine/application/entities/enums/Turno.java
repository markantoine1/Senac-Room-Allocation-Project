/**
 * 
 */
package com.markantoine.application.entities.enums;


public enum Turno {
	MANHÃ(0),
	TARDE(1),
	NOITE(2);
	
	private int code;
	
	private Turno(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Turno valueOf(int code) {
		for(Turno value : Turno.values()) {
			if (code == value.getCode()){
				return value;
			}			
		}
		throw new IllegalArgumentException("Código de turno inválido.");
	}
}
