package ar.edu.unq.po2.tp3;

public class Rectangle extends Forma4Lados{

	

	
	public Rectangle(Point puntaA, Point puntaD) {
		super(puntaA, puntaD);
		// TODO Auto-generated constructor stub
	}
	
	
	public int perimetro() {
		return 2*(this.alto() + this.ancho());
	}
	
	//Es vertical u Horizontal
	public String posicion() {
		return (this.alto() > this.ancho()) ? "Vertical" : "Horizontal";
	}
//	
//	//Perimetro
//	public int perimetro() {
//		return 2*(this.alto() + this.ancho());
//	}
//	
//	//Area Area = alto * ancho
//	public int area() {
//		return this.alto() * this.ancho();
//	}
//	//alto
//	public int alto() {
//		return puntaA.getY() - puntaC.getY();
//	}
//	//ancho
//	public int ancho() {
//		return puntaB.getX() - puntaA.getX();
//	}
//	
//
//	//Getters
//	public Point getPuntaA() {
//		return puntaA;
//	}
//	public Point getPuntaB() {
//		return puntaB;
//	}
//	public Point getPuntaC() {
//		return puntaC;
//	}
//	public Point getPuntaD() {
//		return puntaD;
//	}
//	

	
	

}
