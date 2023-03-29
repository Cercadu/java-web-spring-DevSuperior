package teste;
import pagamento.Autorizavel;
import pagamento.cartao;
import pagamento.operadora;

public class cielo implements operadora{

	@Override
	public boolean autorizador(Autorizavel autorizar, cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")&&Autorizavel.getValorTotal() < 100;
		
	}
	
}