import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp3.*;

public class EquipoTrabajoTest {
	
	EquipoTrabajo equipo = new EquipoTrabajo("LosPerros");
	
	Persona11 personaA;
	Persona11 personaB;
	Persona11 personaC;
	Persona11 personaD;
	Persona11 personaE;
	
	
	@BeforeEach
	public void setUp() {

		
		Persona11 personaA = new Persona11("Elias", 21);
		Persona11 personaB = new Persona11("Marias", 50);
		Persona11 personaC = new Persona11("Pedro", 18);
		Persona11 personaD = new Persona11("Ave", 33);
		Persona11 personaE = new Persona11("Manolo", 91);
		
		equipo.addIntegrante(personaA);
		equipo.addIntegrante(personaB);
		equipo.addIntegrante(personaC);
		equipo.addIntegrante(personaD);
		equipo.addIntegrante(personaE);
	}
	
	@Test
	public void promedioEdadesTest() {
		assertEquals(43, equipo.edadPromedio());
	}
	
	
}
