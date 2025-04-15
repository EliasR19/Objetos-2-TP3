import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp3.*;



public class CounterTest {

	private Counter counter;
	
	
	@Nested 
	class Punto1 {
		
	
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
		///PUNTO 1///

		@Test
		public void testCantPares() {
			assertEquals(1, counter.cantPares());
		}
		@Test
		public void testCantImpares() {
			assertEquals(9, counter.cantImpares());
		}
		@Test
		public void testCantMultiplos() {
			assertEquals(2, counter.cantMultiplos(3));
		}
		
		
	}

	///PUNTO 2///
	@Test 
	public void testMaxEvenDigitsNumCount() {
		counter = new Counter();
		counter.addNumber(111);
		counter.addNumber(3332);
		counter.addNumber(555);
		counter.addNumber(204452);
		
		assertEquals(204452, counter.maxEvenDigitsNumCount());
	}
	
	///PUNTO 3////
	@Test 
	public void testnumMaxMultiplo() {
		Counter counter = new Counter();
		
		assertEquals(999, counter.numMaxMultiplo(3, 9));
		assertEquals(-1, counter.numMaxMultiplo(67, 88));
		
	}
	

}
