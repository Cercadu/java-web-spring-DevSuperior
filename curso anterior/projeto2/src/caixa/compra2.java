package caixa;
import impressao.impressora;
import impressao.imprimivel;

import pagamento.Autorizavel;
import pagamento.cartao;

public class compra implements Autorizavel,imprimivel{
	private double valorTotal;
	private String Produto;
	private String nomeCliente;
	private String getNomeCliente;
	
	public double getValorTotal() {
		// TODO Auto-generated method stub
		return  this.valorTotal;
	}

	@Override
	public String getCabecalhoPagina() {
		// TODO Auto-generated method stub
		return this.getCabecalhoPagina()+"="+ this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		// TODO Auto-generated method stub
		
		return this.getNomeCliente;
	}

	public void setProduto(String string) {
		// TODO Auto-generated method stub
		
	}
	