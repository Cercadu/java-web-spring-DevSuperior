package ccaixa;

import impressora.Impressora;
import pagamentos.Cartao;
import pagamentos.Operadora;

public class checkout {

	private Operadora operadora;
	private Impressora impressora;
	
	public checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado!");
		}
	}
	
}
