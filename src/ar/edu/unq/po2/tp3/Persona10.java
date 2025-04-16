package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

///PUNTO 10
public class Persona10 {

	private String name;
	private LocalDate birthDay;
	
	public Persona10(String name, LocalDate birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}
	
	public boolean menorQue(Persona10 personaB) {
		return this.edad() < personaB.edad();
	}
	
	public int edad() {
		return Period.between(LocalDate.now(), birthDay).getYears();
	}
}
