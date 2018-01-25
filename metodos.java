package metodos;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner teclado = new Scanner(System.in);
		
		
		byte opcio;
		int valor;
		
		do {
			
			imprime("Menu");
			imprime("1 - Genera pares");
			imprime("2 - Genera impares");
			imprime("3 - Salir");
			imprime("Elige una opción");
			
			opcio = teclado.nextByte();
			
			imprime("Numero a generar");
			
			valor = teclado.nextInt();
			
			switch (opcio) {
			case 1:
				
				generaPares(valor);
				
				
				break;
				
			case 2:
				
				generaImPares(valor);
				
				break;

			default:
				break;
			}
			
		} while (opcio !=0);
		
		imprime("Gracias por usar esta app");
		
		teclado.close();

	}

	
	public static int calCub (int num) {
		
		int resultado = num * num * num;
		return resultado;
		
	}
	
	public static void imprime(String mensaje) {
		
		System.out.println(mensaje);
		
	
	}
	public static int SUMA(int n1, int n2) {
		
		int resultado = n1 + n2;
		return resultado;
		
	}
	
	public static int sumatorio(int suma) {
		
		int result = 0;
		
		for (int i = 1; i <= suma; i++) {
			
			result += i;
			
			
		}
		
		return result;
	}
	
	public static void generaPares(int num) {
		
			
		for (int i = 1; i<=num; i++) {
			
					
			if (i%2 == 0) {
				
				imprime("par "+i);
				
			}
				
		}
				
	}
	
	public static void generaImPares(int num) {
		
		
		for (int i = 1; i<=num; i++) {
			
					
			if (i%2 != 0) {
				
				imprime("impar "+i);
				
			}
				
		}
				
	}
		
	
}
