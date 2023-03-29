package com.algarworks.curso.fjoo.polimorfismo;

public class TestePoliformismo {

	public static void main(String[] args) {
		Conta conta = new Conta()
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		Conta contaCorrente = new contaCorrente();
		contaCorrente.setSaldo(contaCorrent);
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da Conta: R$" + conta.getSaldo());
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limit da cc é R$" + cc.getLimit());s
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O limit da cp é R$" + cc.getRendimentos());
		}
			
			
			
			
		Conta conta = new Conta()
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		Conta contaCorrente = new contaCorrente();
		contaCorrente.setSaldo(contaCorrent);
	}
	
}
