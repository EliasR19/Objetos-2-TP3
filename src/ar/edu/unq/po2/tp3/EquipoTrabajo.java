package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoTrabajo {
	private String name;
	private List<Persona11> integrantes = new ArrayList<Persona11>();
	
	public EquipoTrabajo(String name) {
		this.name = name;
	}
	
	public void addIntegrante(Persona11 p) {
		integrantes.add(p);
	}
	
	public String getName() {
		return this.name;
	}
	
	public float edadPromedio() {
		float sumaEdades = integrantes.stream().mapToInt(Persona11::getAge).reduce(0, (a,b) -> a+b);
		float promedio = Math.round(sumaEdades / integrantes.size());
		return promedio;
		
	}
}
