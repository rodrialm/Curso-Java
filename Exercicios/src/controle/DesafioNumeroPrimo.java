package controle;

import java.util.Scanner;

public class DesafioNumeroPrimo {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o numero que deseja saber se ele é um numero primo: ");
		int valor = entrada.nextInt();

		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		
		if (contadorDeDivisores == 0 ) {
			System.out.printf("%d é um numero primo.", valor);

		} else {
			System.out.printf("%d é um numero primo.", valor);
			
		}

		entrada.close();
	}
}
