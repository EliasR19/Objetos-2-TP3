import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import ar.edu.unq.po2.tp3.*;

public class MultiOpTest {

	private Multioperador mulOp;	

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
			assertEquals(89, mulOp.subNumList());
		}
		@Test
		public void testMulNumList() {
			assertEquals(7872, mulOp.mulNumList());
		}
}

