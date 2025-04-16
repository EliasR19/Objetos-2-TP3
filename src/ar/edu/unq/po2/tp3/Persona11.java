package ar.edu.unq.po2.tp3;

public class Persona11 {
	private String name, lastName;
	private int age;
	public String getName() {
		return name;
	}
	
	public Persona11(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
