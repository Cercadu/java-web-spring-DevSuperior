package com.algaworks.curso.fjoo.heranca;

public class Pessoa {

	String nome;
	protected int idade;
	String time;
	
	public void seApresentar() {
		System.out.println("Ol�, eu sou o " + nome + ", e tenho " + idade + " anos.");
	}
	
}