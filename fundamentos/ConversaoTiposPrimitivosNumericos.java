package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita pois eu tenho um double e um número inteiro que é o 1
		System.out.println(a);
		
		float b = (float) 1.12384618923746; // Conversão explicita (CAST)
		System.out.println(b); 
		
//		Na saída em console podemos ver que teve perda de informação.
//		Quando fazemos uma conversão explicita estamos cientes de que isso 
//		pode acontecer, o java faz o truncamento para acomodar o valor na 
//		variável em questão
		
		int c = 129;
		byte d = (byte) c; // O java não analisa valores, analisa tipos.
		System.out.println(d);
		
		double e = 1.99999; // Conversão implicita
		int f = (int) e;
		System.out.println(f);
	}
}
