package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		String alt = entrada.nextLine().replace(",","."); 
		Double altura = Double.parseDouble(alt);
		altura = Math.pow(altura, 2);
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / altura;
		System.out.printf("Seu IMC é de %f", imc );
		
		
		
		entrada.close();
	}
}
