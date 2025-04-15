package ar.edu.unq.po2.tp3;

public abstract class Forma4Lados {
	private Point puntaA;
	private Point puntaB;
	private Point puntaC;
	private Point puntaD;

	
	public Forma4Lados(Point puntaA, Point puntaD) {
		this.setPuntaA(puntaA);
		this.setPuntaD(puntaD);
		this.setPuntaB(new Point(puntaD.getX(), puntaA.getY()));
		this.setPuntaC(new Point(puntaA.getX(), puntaD.getY()));
		
		this.forma();
		
	}
	
	
	//Perimetro
	public abstract int perimetro();

	
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
	
	//Que forma es
	public String forma() {
		return (this.alto() == this.ancho()) ? "Cuadrado" : "Rectangulo";
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
	
	

}
