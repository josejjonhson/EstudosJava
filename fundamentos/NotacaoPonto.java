package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		// A notação ponto é usada para acessar os métodos de um determinado dado

		String s = "Bom dia X";
		s = s.toUpperCase();
		System.out.println(s);

		s = s.replace("X", "senhora");
		System.out.println(s);

		s = s.concat("!!!");
		System.out.println(s);

		System.out.println("José Jonhson".toUpperCase());
		
		// Tipos primitivos não tem o operador "."
	}
}
