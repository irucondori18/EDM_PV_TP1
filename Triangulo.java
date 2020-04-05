package ar.edu.unju.edm.modelo;

public class Triangulo {

	public Triangulo() {
		
	}
	
	public double calcularArea(double base, double altura){
		return (base*altura)/2;
	}
	
	public double calcularPer(double ladoA, double ladoB, double ladoC){
		return ladoA+ladoB+ladoC;
	}
}
