package com.algaworks.curso.fjoo.heranca;

public class Jogador extends Pessoa {

	protected boolean aindaJoga = true;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
	
	public void time() {
		System.out.println("Jogo no :" + time );
	}
	
}
