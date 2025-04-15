import ar.edu.unq.po2.tp3.*;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

public class Forma4LadosTest {
	

	Cube cube;

	@Nested
	class RectangleTest {
		Point pointA = new Point(2,5);
		Point pointD = new Point(5,1);
		Rectangle rect = new Rectangle(pointA, pointD);
		
		@Test
		public void forma() {
			assertEquals("Rectangulo", rect.forma());
		}
		@Test
		public void area() {
			assertEquals(12, rect.area());
		}
		
		@Test
		public void perimetro() {
			assertEquals(14, rect.perimetro());
		}
		
		@Test
		public void posicion() {
			assertEquals("Vertical", rect.posicion());
		}
	}
	
	@Nested
	class CubeTest {
		Point pointA = new Point(2,4);
		Point pointD = new Point(5,1);
		Cube cube = new Cube(pointA, pointD);
	
		@Test
		public void forma() {
			assertEquals("Cuadrado", cube.forma());
		}
		@Test
		public void area() {
			assertEquals(9, cube.area());
		}
		
		@Test
		public void perimetro() {
			assertEquals(12, cube.perimetro());
		}
		
	}
	
}
