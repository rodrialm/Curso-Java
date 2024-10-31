package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4;
		String resultadoParcial = media >= 5.0 ? "em Recuperação " : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("o aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s" , resultado);
	}
}
