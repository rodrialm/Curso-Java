package fundamentos;


import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		Double sal1 = Double.parseDouble(salario1);

		System.out.println("Digite o primeiro salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		Float sal2 = Float.parseFloat(salario2);

		System.out.println("Digite o primeiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		Double sal3 = Double.parseDouble(salario3);

		double media = (sal1 + sal2 + sal3) / 3;

		System.out.println("A media dos ultimos 3 sálario informados é: " + media);

		entrada.close();
	}
}