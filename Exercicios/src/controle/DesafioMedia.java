package controle;

import java.util.Scanner;

public class DesafioMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;

		for (int i = 1; i <= 1; i++) {
			System.out.print("Informe o valor da primeira nota: ");
			nota1 = entrada.nextDouble();
			while (nota1 < 0 || nota1 > 10) {
				System.out.print("Erro! \nDigite novamente:");
				nota1 = entrada.nextDouble();
			} 
				System.out.println("Ok!");
			

			System.out.print("Informe o valor da segunda nota: ");
			nota2 = entrada.nextDouble();
			while (nota2 < 0 || nota2 > 10) {
				System.out.print("Erro! \nDigite novamente:");
				nota2 = entrada.nextDouble();
			} 
				System.out.println("Ok!");
			

		}
		double media = (nota1 + nota2) / 2;

		System.out.println("\nMédia do Aluno: " + media);

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		entrada.close();
	}
}
