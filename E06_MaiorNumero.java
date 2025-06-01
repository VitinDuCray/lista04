package lista04_JAVA;

import java.util.Scanner;

public class E06_MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° número:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o 2° número:");
		int numero2 = sc.nextInt();
		System.out.println("Digite o 3° número:");
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior número é o 1°.    (" + numero1 + ")");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior número é o 2°.    (" + numero2 + ")");
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior número é o 3°.    (" + numero3 + ")");
		}
		else {
			System.out.println("Erro!");
		}
		
		sc.close();
	}

}
