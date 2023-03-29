package pagamento.operadoras;

import pagamento.Autorizavel;
import pagamento.Cartao;
import pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
package com.algaworks.pagamento.operadoras;

import com.algaworks.pagamento.Autorizavel;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
