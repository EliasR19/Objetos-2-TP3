import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;


import ar.edu.unq.po2.tp3.*;



public class CounterTest {

	private Counter counter;
		
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	@Test
	public void testCantPares() {
		assertEquals(1, counter.cantPares());
	}
}
