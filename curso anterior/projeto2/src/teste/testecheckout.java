package teste;
import caixa.compra;
import impressao.impressora;
import pagamento.cartao;
import pagamento.operadora;

public class testecheckout {
	
	public static void main(String args) {
		operadora operadora = null;
		impressora impressora = null;
		
		cartao cartao = new cartao();
		cartao.setNomeTitular("Cadu");
		cartao.setNumeroCartao("453");
		
		compra compra = new compra();
		compra.setnomeCliente("Joao Mendonca Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
	}

}
