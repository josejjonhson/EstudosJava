package fundamentos;

public class TiposPrimitivosPratica {

	public static void main(String[] args) {
		// Informações de um funcionário
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 20;
		short numeroDeVoos = 10000;
		int id = 872364;
		long pontosAcumulados = 3_134_234_111L;
		
		// Tipos numericos reais
		float salario = 0.00F; // Colocamos o F e o L pois os literais inteiros por padrão são do tipo 'int' e literais com ponto flutuante são do tipo 'double'
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo boolear
		boolean estaDeFerias = true; // Ou false
		
		// Tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
