package fundamentos.operadores;

import java.util.Scanner;

public class DesafioQuadradoCubo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor para ser elevado ao Quadrado e ao Cubo: ");

		Double valor = entrada.nextDouble();
		Double quadrado = Math.pow(valor, 2);		
		Double cubo = Math.pow(valor, 3);
		
		System.out.printf("O valor de %s \nao quadrado é: %.2f \nao cubo é: %.2f  ", valor , quadrado, cubo);


		entrada.close();
	}
}