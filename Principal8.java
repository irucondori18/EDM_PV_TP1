package ar.edu.unju.edm.principal;

import java.util.Scanner;

public class Principal8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Ingrese altura h: ");
		double h = sc.nextDouble();
		System.out.println("Ingrese radio r: ");
		double r = sc.nextDouble();
		
		double conoVolumen = (1d/3) * Math.PI * Math.pow(r, 2)* h;
		System.out.println("El volumen del cono es: " + conoVolumen);
		
		sc.close();
		
	}

}
