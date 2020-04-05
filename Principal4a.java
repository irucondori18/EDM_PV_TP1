package ar.edu.unju.edm.principal;

public class Principal4a {

	public static void main(String[] args) {
		
		int x = 0;
		
		while (x++ <= 100){
			System.out.print(x);
			if (x % 4 == 0){
				System.out.print(" es múltiplo de cuatro");
			}
			System.out.println();
		}
		
		System.out.println();
		x = 0;

		do{
			System.out.print(x);
			if (x % 4 == 0){
				System.out.print(" es múltiplo de cuatro");
			}
			System.out.println();
			x++;
		} while(x <= 100);
	}

}
