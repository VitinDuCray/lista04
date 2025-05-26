package lista04;

import java.util.Scanner;

public class E02_Maioridade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Você é menor de idade.");
		}
		else {
			System.out.println("Você é maior de idade.");
		}
		
		sc.close();
	}

}
