package controle;

import java.util.Scanner;

public class DesafioPar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número para saber se é "
				+ "Par ou Impar: ");
		int num1 = entrada.nextInt();
		if (num1 % 2 == 0) {
			System.out.printf("%d é um número par",num1);
		}else {
			System.out.printf("%d é um número impar",num1);
		}
		
		entrada.close();
	}
}
