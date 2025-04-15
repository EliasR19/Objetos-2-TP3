package ar.edu.unq.po2.tp3;

public class Rectangle {
	private Point puntaA;
	private Point puntaB;
	private Point puntaC;
	private Point puntaD;
	
	public Rectangle(Point puntaA, Point puntaD) {
		//Suponer que el usuario sabe que tiene que poner las puntas opuestas. A y D
		this.puntaA = puntaA;
		this.puntaD = puntaD;
		this.puntaB = new Point(puntaD.getX(), puntaA.getY());
		this.puntaC = new Point(puntaA.getX(), puntaD.getY());
		
	}
	
	//Es vertical u Horizontal
	public String posicion() {
		return (this.alto() > this.ancho()) ? "Vertical" : "Horizontal";
	}
	
	//Perimetro
	public int perimetro() {
		return 2*(this.alto() + this.ancho());
	}
	
	//Area Area = alto * ancho
	public int area() {
		return this.alto() * this.ancho();
	}
	//alto
	public int alto() {
		return puntaA.getY() - puntaC.getY();
	}
	//ancho
	public int ancho() {
		return puntaB.getX() - puntaA.getX();
	}
	

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
	

	
	

}
