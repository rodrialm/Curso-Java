package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >=0) {
			total += nota;
			quantidadeDeNotas++;
			} else if (nota != -1){
				System.out.println("Nota inválida!!! ;D");
			}
		}
		// Calcular a média
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		entrada.close();
		
//		System.out.println("Informe o valor correto da nota:");
//		valor = entrada.nextDouble();
//		
//		do {
//			
//			// preciso criar a variavel "condição" para ela ser responsavel para recever o "valor"!!!!!!!
//			
//			
//			while( fim!= -1) {		
//			if (condicao <0 || condicao > 10) {
//			valor = entrada.nextDouble();
//			System.out.println("valor informado não é aceito!");
//			System.out.println("Informe o valor correto da nota:");
//			}
//			else if (condicao >= 0 || condicao <= 10){
//				System.out.println("Informe o valor da nota:");
//				valor = entrada.nextDouble(); 
//				contagem++;
//			}
//			
//			nota += valor;
//			fim = valor;
//			System.out.printf("\nA nota informa é %.1f.\n"
//					+ "A nota total é de %.1f.\n"
//					+ "Sendo um total de %.1f notas informadas."
//					+ "\n\n",valor , nota , contagem);
//			} 
//		}while (fim != -1);
//		
	}
}