package fundamentos;

public class DesafioBhaskara {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 12;
		double c = -13;
		
//		Formula é delta = b² - 4ac
		double calculo = Math.pow(b, 2)- 4*a*c;
		
		System.out.println("Delta é igual a " + calculo);
		
	}
}
