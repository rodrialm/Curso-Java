package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o dia da semana: ");
		String dia = entrada.next();
		 
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1º");
		} 
		else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("2º");
		}
		else if (dia.equalsIgnoreCase("Terca") ||
				dia.equalsIgnoreCase("Terça")) {
			System.out.println("3º");
		}
		else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4º");
		}
		else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5º");
		}
		else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6º");
		}
		else if (dia.equalsIgnoreCase("Sábado") ||
				dia.equalsIgnoreCase("Sabado")) {
			System.out.println("7º");
		}
		else {
			System.out.printf("%s não é um dia da semana!",dia);
		}
		
		entrada.close();
	}
}
