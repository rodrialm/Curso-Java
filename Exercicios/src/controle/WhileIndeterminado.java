package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		
		
		
		
		entrada.close();
		
//		Minha Ideia de solução:
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Olá, como posso ajudar? ");
//		String comando = entrada.nextLine();
//		
//		while (!comando.equalsIgnoreCase("sair")) {
//			if (comando.equalsIgnoreCase("sair")) {
//				System.out.println("Encerrando!");
//			}else 
//			System.out.println("Olá, como posso ajudar? ");
//			String comando2 = entrada.nextLine();
//			comando = comando2;
//		}
//		entrada.close();

		}
}
