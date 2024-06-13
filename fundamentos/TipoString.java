package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá!".charAt(2));
		
		String s = "Boa noite";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		// A String é um objeto imutável, não conseguimos modifivar o valor original que foi colocado, apenas substituir o valor
		
		System.out.println("Boa tarde a todos!".startsWith("Boa"));
		System.out.println("Boa tarde a todos!".startsWith("boa"));
		System.out.println("Boa tarde a todos".endsWith("todos"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa noite"));
		System.out.println(s.equalsIgnoreCase("boa noite"));
		
		var nome = "José";
		var sobrenome = "Jonhson";
		var idade = 20;
		var salario = 1000.5050;
		
		System.out.printf("Nome: %s %s tem %d anos e ganha %.2fR$", nome, sobrenome, idade, salario);
		
		// Usando o String.format
		
		var instrumento = "Guitarra";
		var banda = "Scorpions";
		String frase = String.format("\nA banda %s tem ótimas linhas de %s", banda, instrumento);
		System.out.println(frase);
		
	}
}
