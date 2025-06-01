package lista04_JAVA;

import java.util.Scanner;

public class E10_TrianguloValido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento do 1° lado do triângulo");
		int lado1 = sc.nextInt();
		System.out.println("Digite o comprimento do 2° lado do triângulo");
		int lado2 = sc.nextInt();
		System.out.println("Digite o comprimento do 3° lado do triângulo");
		int lado3 = sc.nextInt();
		int somalado1e2 = lado1 + lado2;
		int somalado1e3 = lado1 + lado3;
		int somalado2e3 = lado2 + lado3;
		
		if (somalado1e2 > lado3 && somalado1e3 > lado2 && somalado2e3 > lado1) {
			System.out.println("Seu triângulo é válido.");
		}
		else {
			System.out.println("Seu triângulo é inválido.");
		}
		
		sc.close();
	}

}
