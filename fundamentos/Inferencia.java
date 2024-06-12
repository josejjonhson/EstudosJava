package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		// Válido para variáveis definidas dentro de métodos
		double a = 4.5;
		System.out.println(a);
		
		var b = 40;
		System.out.println(b);
		
		var c = "José Jonhson";
		c = "Outro texto";
		System.out.println(c);
//		c = 12; o que não pode ser feito é colocar outro tipo de dado associado a variável
		
		double d; // Declaração
		d = 123.56; // Inicialização
		System.out.println(d); // Usando a variável
		
//		var variavel;
//		variavel = 12;
//		System.out.println(variavel); 
		
//		como o var não podemos criar a variável em uma linha e atribuir valor em outra
	}
}
