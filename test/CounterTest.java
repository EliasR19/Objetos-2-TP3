import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp3.*;



public class CounterTest {

	private Counter counter;
	private Multioperador mulOp;	
	
	
	@Nested @Disabled 
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
		/////aa
		@Test
		public void testCantPares() {
			assertEquals(1, counter.cantPares());
		}
		public void testCantImpares() {
			assertEquals(9, counter.cantImpares());
		}
		public void testCantMultiplos() {
			assertEquals(1, counter.cantMultiplos(3));
		}
		
		
	}

	///PUNTO 2///
	@Test @Disabled 
	public void testMaxEvenDigitsNumCount() {
		counter = new Counter();
		counter.addNumber(111);
		counter.addNumber(3332);
		counter.addNumber(555);
		counter.addNumber(204452);
		
		assertEquals(204452, counter.maxEvenDigitsNumCount());
	}
	
	///PUNTO 3////
	@Test @Disabled 
	public void testnumMaxMultiplo() {
		Counter counter = new Counter();
		
		assertEquals(999, counter.numMaxMultiplo(3, 9));
		assertEquals(-1, counter.numMaxMultiplo(67, 88));
		
	}
	
	@Nested
	class Punto6{
		
		@BeforeEach
		public void setUp() throws Exception{
			mulOp = new Multioperador();
			mulOp.addNumber(123);
			mulOp.addNumber(2);
			mulOp.addNumber(32);
		}
		
		@Test
		public void testSumNumList() {
			assertEquals(157, mulOp.sumNumList());
		}
		@Test
		public void testSubNumList() {
			assertEquals(-157, mulOp.subNumList());
		}
		@Test
		public void testMulNumList() {
			assertEquals(7872, mulOp.mulNumList());
		}
	}
}
