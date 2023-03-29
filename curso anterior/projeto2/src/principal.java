

public class principal {
	
	public static void main(String[] args) {
		
		carro meucarro; // declaramos a variável carro
		carro seucarro; // declaramos a variável carro
		
		meucarro = new carro(); // instanciamos a variavel com um objeto tipo carro
		seucarro = new carro(); // instanciamos a variavel com um objeto tipo carro
		
		meucarro.modelo ="Uno";
		meucarro.cor = "Branco";
		meucarro.fabricante = "Fiat";		
		meucarro.anoDeFabricaçao = 2011;
		
		meucarro.modelo ="Civic";
		meucarro.cor = "Preto";
		meucarro.fabricante = "Honda";		
		meucarro.anoDeFabricaçao = 2022;
		
		System.out.println("Modelo:" + meucarro.modelo);
		System.out.println("Modelo:" + meucarro.cor);
		System.out.println("Modelo:" + meucarro.fabricante);
		System.out.println("Modelo:" + meucarro.anoDeFabricaçao);
		
		System.out.println("Modelo:" + seucarro.modelo);
		System.out.println("Modelo:" + seucarro.cor);
		System.out.println("Modelo:" + seucarro.fabricante);
		System.out.println("Modelo:" + seucarro.anoDeFabricaçao);
		
	}	

}
