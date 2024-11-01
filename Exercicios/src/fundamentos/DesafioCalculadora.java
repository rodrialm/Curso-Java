package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o Primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o Segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação a fazer (+ - * / %): ");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador)? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("O Resultado de %.2f %s %.2f é: %.2f", num1 , operador, num2 , resultado );
		
		entrada.close();
	}
}
