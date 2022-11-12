package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<Conta> contas = new ArrayList<Conta>();
	
	//Alem da referencia do desafio
	public void cadastrarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	//Alem da referencia do desafio
	public void contasCadastradas() {
		for(Conta conta : contas) {
			conta.InformacoesDaConta();
		}
	}
}
