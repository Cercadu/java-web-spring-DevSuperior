package com.algarworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {
	String dataValidade;
	
	public void imprimirDescricao()
	{
		System.out.println("Descricao: " + super.getDescricao()+".Vencendo em: " + dataValidade)
	}


}
