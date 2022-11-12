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
		System.out.println("\n-- Extrato Conta Poupan�a --");
		super.InformacoesDaConta();
		System.out.println("\n------------------------------");
	}
}
