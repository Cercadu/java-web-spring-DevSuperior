
public class carro {
	
		 String fabricante;
		 String modelo;
		 String cor;
		 int anoDeFabrica�ao;
		 boolean bicombustivel;
		 
		 Proprietario dono;
		 
		 void ligar() {
			 if (modelo == null) {
				 System.out.println("Ligando o carro: " + modelo);
			 }
		 }
	}