package lista04;

import java.util.Scanner;

public class E07_Intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número");
		int numero = sc.nextInt();
		
		if (numero >= 10 && numero <= 20) {
			System.out.println("O número está presente no intervalo");
		}
		
		sc.close();
	}

}
