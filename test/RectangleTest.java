import ar.edu.unq.po2.tp3.Rectangle;
import ar.edu.unq.po2.tp3.Point;

import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
	
	Rectangle rect;
	
	@BeforeEach
	public void setUp() {
		Point pointA = new Point(2,5);
		Point pointD = new Point(5,1);
		rect = new Rectangle(pointA, pointD);
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
