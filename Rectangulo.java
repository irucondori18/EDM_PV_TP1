package ar.edu.unju.edm.modelo;

public class Rectangulo {

	public Rectangulo() {
		
	}
	
	public double calcularArea(double base, double altura){
		return base*altura;
	}
	
	public double calcularPer(double base, double altura){
		return 2*(base + altura);
	}
}
