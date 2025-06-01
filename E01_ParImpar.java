package lista04_JAVA;

import java.util.Scanner;

public class E01_ParImpar {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int numero = sc.nextInt();
		int check = numero % 2;
		
		if (check == 0) {
			System.out.println("O número " + numero + " é par.");
		}
		else {
			System.out.println("O número " + numero + " é impar.");
		}
		
		
		sc.close();
	}
}
