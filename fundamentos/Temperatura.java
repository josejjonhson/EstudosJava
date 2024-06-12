package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		// Detalhes: 32 armazenado em uma constante, 5/9 também e o resultado em C e F devem ser armazenados em variáveis.
		
		final int AJUSTE = 32;
		final double MULTIPLICADOR = 5.0 / 9.0;
		
		double temperaturaEmFahrenheit = 180.0;
		double temperaturaEmCelsius = (temperaturaEmFahrenheit - AJUSTE) * MULTIPLICADOR;
		
		System.out.println("A temperatura " + temperaturaEmFahrenheit + "°F corresponde a " + temperaturaEmCelsius + "°C");
		
		temperaturaEmFahrenheit = 60;
		temperaturaEmCelsius = (temperaturaEmFahrenheit - AJUSTE) * MULTIPLICADOR;
		
		System.out.println("A temperatura " + temperaturaEmFahrenheit + "°F corresponde a " + temperaturaEmCelsius + "°C");
		
	}
}
