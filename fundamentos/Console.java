package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o seu nome> ");
		String nome = in.nextLine();
		System.out.print("Informe a sua idade> ");
		int idade = in.nextInt();
		
		String frase = String.format("Olá, meu nome é %s e eu tenho %d anos de idade.", nome, idade);
		
		System.out.println(frase);
		
		in.close();
	}
}
