package fundamentos;

public class fahrenheitSoma {

		public static void main(String[] args) {
			final double fator = 5.0/9.0;
			final int ajuste = 32;
			double fahrenheit  = 150;
			double celsius = (fahrenheit - ajuste) * fator;
			System.out.println("O Valor em Celsius é : " + celsius + "ºC.");
		}
}
