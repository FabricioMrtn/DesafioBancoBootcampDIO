package conta;

import modelo.Cliente;
import modelo.Conta;

public class ContaCorrente extends Conta{
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void InformacoesDaConta() {
		System.out.println("\n------------------------------");
		System.out.println("\n-- Extrato Conta Corrente --");
		super.InformacoesDaConta();
		System.out.println("\n------------------------------");
	}
}
