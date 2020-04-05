package ar.edu.unju.edm.principal;

import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		
		double g=9.81;

		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese altura h: ");
		
		double h = sc.nextDouble();
		
		double resultado= Math.sqrt((2 * h)/g);
		
		System.out.println("El resultado es " + resultado);
		
		sc.close();
	}

}
