public class passeio {

	public static void main(String[] args) {
		pessoa p1 = new pessoa();
		p1.nome = "José";
		
		/*
		Cachorro cachorro = new Cachorro()
		p1.cachorro = cachorro;
		*/
		p1.cachorro = new cachorro();
		
		p1.cachorro.nome = "Bidu";
		p1.cachorro.idade = 3;
		p1.cachorro.sexo = 'M';
		
		caminhada c = new caminhada();
		c.andar(p1);
		
	}
	
}