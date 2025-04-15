package ar.edu.unq.po2.tp3;
public class Cube extends Forma4Lados {

	public Cube(Point puntaA, Point puntaD) {
		super(puntaA, puntaD);
		// TODO Auto-generated constructor stub
	}
	
	public int perimetro() {
		return this.alto() * 4;
	}

}
