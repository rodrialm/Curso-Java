package fundamentos;

public class TiposPrimitivos {

		/**
		 * @param args
		 */
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// Iformações do funcionário
			
			// Tipos numéricos inteiros
			
			byte anosDeEmpresa = 23;
			short numeroDeVoos = 542;
			int id = 56789;
			long pontosAcumulados = 3_234_845_223L;
			
			// Tipos numéricos reais
			float salario = 11_445.44F;
			double vendasAcumuladas = 2_991_797_103.01;
			
			// Tipos booleano
			boolean estaDeFerias = true;
			
			// Tipo caractere
			char status = 'A';
			
			// Dias de empresa
			System.out.println(anosDeEmpresa * 365);
			
			// Número de viagens
			System.out.println(numeroDeVoos / 2 );
			
			// Pontos por real
			
			System.out.println(pontosAcumulados / vendasAcumuladas);
			
			System.out.println(id + ": ganha ->" + salario);
			System.out.println("Ferias? " + estaDeFerias);
			System.out.println("Status: " + status);
	}
}
