package ar.edu.unju.edm.principal;

import java.util.Scanner;

import ar.edu.unju.edm.modelo.Rectangulo;

public class Principal9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese base del rectángulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese altura del rectángulo: ");
		double altura = sc.nextDouble();
		
		Rectangulo unRectangulo = new Rectangulo();
		
		System.out.println("El área es: "+unRectangulo.calcularArea(base, altura));
		System.out.println("El perímetro es: "+unRectangulo.calcularPer(base, altura));
		
		sc.close();
	}

}
