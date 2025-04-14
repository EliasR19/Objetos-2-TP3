
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;



import ar.edu.unq.po2.tp3.Point;

public class PointTest {
	private Point point;
	
	@BeforeEach
	public void setUp() throws Exception{
		point = new Point(2,5);
	}
	
	private void checkPosition(Point point, int x, int y) {
		assertEquals(x, point.getX());
		assertEquals(y, point.getY());
	}
	
	@Test
	public void createPoint() {
		checkPosition(point, 2, 5);

	}
	
	@Test
	public void MovePoint() {
		point.movepoint(10, 20);
		checkPosition(point, 10, 20);
	}
	
	@Test
	public void sumPoints() {
		Point pointB = new Point();
		pointB.setX(4);
		pointB.setY(8);
		
		
		Point finalPoint = point.sumPoint(pointB);
		
		checkPosition(finalPoint, 6, 13);
	}
}
