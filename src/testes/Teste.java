package testes;

import java.math.BigDecimal;

import conta.ContaCorrente;
import conta.ContaPoupanca;
import modelo.Banco;
import modelo.Cliente;

public class Teste {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente cl1 =  new Cliente("Fabricio", "01230123");
		Cliente cl2 =  new Cliente("Martins", "01230123");
		ContaCorrente cc1 = new ContaCorrente(cl1);
		ContaCorrente cc2 = new ContaCorrente(cl2);
		ContaPoupanca cp1 = new ContaPoupanca(cl1);
		
		banco.cadastrarConta(cp1);
		banco.cadastrarConta(cc1);
		banco.cadastrarConta(cc2);
		
		cp1.deposito(new BigDecimal("5000"));
		cc2.deposito(new BigDecimal("100"));
		cc1.deposito(new BigDecimal("100"));
		
		cc1.saque(new BigDecimal("50"));
		
		cc1.transferencia(cc2, new BigDecimal(70));

//		cc1.InformacoesDaConta();
//		cp1.InformacoesDaConta();
//		banco.contasCadastradas();
		cl1.contasCadastradas();
		cl2.contasCadastradas();
		
		
	}
}
