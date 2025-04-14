package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		x = 0;
		y = 0;
	}
	//Getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	//Setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	//Mover punto
	public void movepoint(int newPosX, int newPosY) {
		x = newPosX;
		y = newPosY;
	}	
	
	
	public Point sumPoint(Point PointB) {
		Point newPoint = new Point(x + PointB.getX(), y + PointB.getY());	
		return newPoint;
	}
}
