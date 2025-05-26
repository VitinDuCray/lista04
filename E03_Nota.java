package lista04;

import java.util.Scanner;

public class E03_Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua nota:");
		int nota = sc.nextInt();
		
		if (nota >= 60 && nota < 101) {
			System.out.println("Você foi aprovado. Parabéns!");
		}
		else if (nota > 100) {
			System.out.println("Nota inválida.");
		}
		else {
			System.out.println("Você foi reprovado.");
		}
		
		sc.close();
	}

}
