package ar.edu.unju.edm.principal;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.next();
		System.out.println(nombre + " Bienvenido a Programación Visual!");
		
		
		Scanner dato = new Scanner(System.in);	
		
		System.out.println("Ingrese nombre completo: ");
		String nombreCompleto = dato.nextLine();
			
		System.out.println("Ingrese edad: ");
		int edad = dato.nextInt();
		
		System.out.println("Ingrese estatura: ");
		double estatura = dato.nextDouble();
		
		System.out.println("Ingrese letra: ");
		char letra;
		letra = dato.next().charAt(0);
		
		System.out.println (nombreCompleto + "\n" + edad + "\n" + estatura + "\n" + letra);
		
		dato.close();
		sc.close();
	}
}