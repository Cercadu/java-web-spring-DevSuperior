package com.algaworks.curso.fjoo.sobrecarga;

public class TesteCadastro {
	public static void main(String [] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		
		 pessoa pessoa = new pessoa("Jose",32);
		 cadastro.cadastrar(pessoa);
		 cadastro.cadastrar("Maria",25);
	}

}
