package conta;

import modelo.Cliente;
import modelo.Conta;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void InformacoesDaConta() {
		System.out.println("\n------------------------------");
		System.out.println("\n-- Extrato Conta Poupança --");
		super.InformacoesDaConta();
		System.out.println("\n------------------------------");
	}
}
