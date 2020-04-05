package ar.edu.unju.edm.principal;

import java.util.Scanner;

public class Principal5b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int n=1;
		while (n <=5){
			System.out.println("Ingrese edad: ");
			int edad = sc.nextInt();
			if (edad >= 1 && edad <= 12 ){
				System.out.println("Es un niño");
			}
			else{
				if(edad >=13 && edad <= 20){
					System.out.println("Es un joven");}
				else{
					if(edad >=14 && edad <=100){
						System.out.println("Es un adulto");}
					else{
						System.out.println("Edad no permitida");
					}
				}
			}
			n++;
		}	
		sc.close();
	}
}
