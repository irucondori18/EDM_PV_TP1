package ar.edu.unju.edm.principal;

public class Principal7 {

	public static void main(String[] args) {
	
		for(int i=320; i>=160;i-=20){
			System.out.println(i);
		}
		
		int i=320;
		
		while(i>=120){
			System.out.println(i);
			i-=20;
		}
		
		i=320;
		
		do{
			System.out.println(i);
			i-=20;
		} while(i>=160);
	}
}
