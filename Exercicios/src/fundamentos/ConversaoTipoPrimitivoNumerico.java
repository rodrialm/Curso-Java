package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;	//implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888;  // explícita (CAST)
		System.out.println(b);
		
		int c = 383;
		byte d = (byte) c;   // explícita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;  //explícita (CAST)
		System.out.println(f);
		
	}
}
