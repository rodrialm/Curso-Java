package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(°F - 32) x 5/9 = °C
	
		final double ajuste = 32;
		final double fator = 5.0/9;
		double F = 150;
		double result = (F - ajuste) * fator;
		
		System.out.println(F + " graus fahrenheit em celcius é = " + result);
		
		F = 0;
		result = (F - ajuste) * fator;
		System.out.println(F + " graus fahrenheit em celcius é = " + result);
	}
}