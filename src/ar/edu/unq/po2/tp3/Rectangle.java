package ar.edu.unq.po2.tp3;

public class Rectangle {
	private Point puntaA;
	private Point puntaB;
	private Point puntaC;
	private Point puntaD;
	
	public Rectangle() {
		puntaA = new Point();
		puntaB = new Point();
		puntaC = new Point();
		puntaD = new Point();
	}
	
	/* colocar una punta Ejemplo:
	 * 
	 * rectangulo.getPuntaA().setX(x);
	 * rectangulo.getPuntaA().setY(y);
	 * O
	 * rectangulo.getPuntaA().movePoint(x,y)
	 */
	
	//Getters
	public Point getPuntaA() {
		return puntaA;
	}
	public Point getPuntaB() {
		return puntaB;
	}
	public Point getPuntaC() {
		return puntaC;
	}
	public Point getPuntaD() {
		return puntaD;
	}
	
	//Setters
	public void setPuntaA(Point puntaA) {
		this.puntaA = puntaA;
	}
	public void setPuntaB(Point puntaB) {
		this.puntaB = puntaB;
	}
	public void setPuntaC(Point puntaC) {
		this.puntaC = puntaC;
	}
	public void setPuntaD(Point puntaD) {
		this.puntaD = puntaD;
	}
	
	//Area
	

}
