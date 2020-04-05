package ar.edu.unju.edm.principal;

import java.util.Scanner;

import ar.edu.unju.edm.modelo.Triangulo;

public class Principal10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese base del triángulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese altura del triángulo: ");
		double altura = sc.nextDouble();
		System.out.println("Ingrese lado A del triángulo: ");
		double ladoA = sc.nextDouble();
		System.out.println("Ingrese lado B del triángulo: ");
		double ladoB = sc.nextDouble();
		System.out.println("Ingrese lado C del triángulo: ");
		double ladoC = sc.nextDouble();
		
		Triangulo unTriangulo = new Triangulo();
		
		System.out.println("El área es: "+unTriangulo.calcularArea(base, altura));
		System.out.println("El perímetro es: "+unTriangulo.calcularPer(ladoA,ladoB,ladoC));
		
		sc.close();		
	}
}
