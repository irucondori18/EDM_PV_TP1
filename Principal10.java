package ar.edu.unju.edm.principal;

import java.util.Scanner;

import ar.edu.unju.edm.modelo.Triangulo;

public class Principal10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese base del tri�ngulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese altura del tri�ngulo: ");
		double altura = sc.nextDouble();
		System.out.println("Ingrese lado A del tri�ngulo: ");
		double ladoA = sc.nextDouble();
		System.out.println("Ingrese lado B del tri�ngulo: ");
		double ladoB = sc.nextDouble();
		System.out.println("Ingrese lado C del tri�ngulo: ");
		double ladoC = sc.nextDouble();
		
		Triangulo unTriangulo = new Triangulo();
		
		System.out.println("El �rea es: "+unTriangulo.calcularArea(base, altura));
		System.out.println("El per�metro es: "+unTriangulo.calcularPer(ladoA,ladoB,ladoC));
		
		sc.close();		
	}
}
