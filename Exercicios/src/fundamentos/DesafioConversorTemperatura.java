package fundamentos;

import java.util.Scanner;

public class DesafioConversorTemperatura {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor de temperatura que deseja converter: ");
		double temp = entrada.nextDouble();
		
		System.out.printf("Escolha qual conversão deseja fazer da temperatura %.2f°: \n",temp );
		
		System.out.println("Digite 'F' para fazer conversão de Fahrenheit para Celsius");
		System.out.println("Digite 'C' para fazer conversão de Celsius para Fahrenheit");
		
		
		String tipoTemp = entrada.next().toUpperCase();
		
		double calculo ="F".equals(tipoTemp)? (temp - 32) * 5.0/9:0;
		calculo ="C".equals(tipoTemp)? (temp * 1.8) + 32 : calculo;
				
		System.out.printf(" O Resultado de %.2f Convertido é : %.2f", temp, calculo);
		
		
		
		entrada.close();
	}
}
