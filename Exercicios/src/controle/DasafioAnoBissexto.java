package controle;

import java.util.Scanner;

public class DasafioAnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o ano que deseja saber se é bissexto: ");
		
		Integer ano = entrada.nextInt();
		ano.toString();
		if(ano % 4 == 0 ) {
			System.out.println("Esse ano é bissexto");
		} else
			System.out.println("Não é bissexto");
		entrada.close();
	}
}