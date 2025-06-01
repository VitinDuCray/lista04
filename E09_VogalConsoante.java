package lista04_JAVA;

import java.util.Scanner;

public class E09_VogalConsoante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra.");
		System.out.println("Só consideramos o primeiro caracter digitado.");
		char letra = sc.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra \"" + letra +  "\" é uma vogal.");
		}
		else {
			System.out.println("\"" + letra + "\" é uma consoante ou algum outro caracter.");
		}
		
		sc.close();
	}

}
