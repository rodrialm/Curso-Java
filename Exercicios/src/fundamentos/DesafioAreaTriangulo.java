package fundamentos;

import java.util.Scanner;

public class DesafioAreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do Triângulo:");
		double base = entrada.nextDouble();

		System.out.println("Informe o valor da altura do Triângulo:");
		double altura = entrada.nextDouble();
		
		double calculo = (base * altura) / 2; 
				
		System.out.printf("Com o valor da base sendo %.1f e a altura sendo %.1f "
				+ "a area do triângulo é %.1f",base , altura , calculo);
		entrada.close();
		
	}
}
