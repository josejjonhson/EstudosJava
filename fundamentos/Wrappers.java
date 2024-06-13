package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		Byte b = 1;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // int
		Long l = 10000000L;
		System.out.println(s.getClass());
		System.out.println(l.getClass());

		System.out.println(b.byteValue());
		System.out.println(b.toString());
		System.out.println(i.getClass());

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.getClass());

		Float f = 230.9f;

		Character c = '$';
		System.out.println(c.getClass());
		System.out.println(c + f + "..");
		
//		Em Java, quando você tenta concatenar um caractere com outros tipos 
//		de dados, o Java primeiro converte o caractere para seu valor numérico
//		na tabela ASCII antes de fazer a concatenação. Então, o caractere '$' é 
//		convertido para seu valor numérico ASCII, que é 36.
//
//		Aqui está a explicação mais detalhada:
//
//		O caractere '$' é convertido para seu valor numérico ASCII, que é 36.
//		Esse valor numérico 36 é somado com o valor de ponto flutuante f.
//		O resultado dessa soma é convertido para uma string.
//		Em seguida, a string ".." é concatenada.
//		Se f for 230.9, então:
//
//		'$' (ASCII 36) + 230.9 = 266.9.
//		266.9 é convertido para uma string.
//		A concatenação resultante é "266.9..".
		
	}
}
