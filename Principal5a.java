package ar.edu.unju.edm.principal;

import java.util.Scanner;

public class Principal5a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero: ");
		float numero = sc.nextFloat();
		if(numero > 0){
			System.out.println("El n�mero es positivo");
		}
		else 
			System.out.println("El n�mero es negativo");
			
		sc.close();
	}

}
