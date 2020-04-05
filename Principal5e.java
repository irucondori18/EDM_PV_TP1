package ar.edu.unju.edm.principal;

import java.util.Scanner;

public class Principal5e {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hora=-1;
		while (hora < 0 || hora > 24){
			System.out.println("Ingrese hora del día: ");
			hora = sc.nextInt();			
		}
		
		if (hora >= 6 && hora <=12 ){
			System.out.println("Buenos días");
		}
		else{
			if(hora >= 13 && hora <= 21){
				System.out.println("Buenas tardes");			
			}
			else{
				System.out.println("Buenas noches");		
			}
		}
		sc.close();
	}
}
