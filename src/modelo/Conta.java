package modelo;

import java.math.BigDecimal;
import java.util.Locale;

import lombok.Getter;
import lombok.Setter;

public abstract class Conta {
	protected static final int AGENCIA_PADRAO = 0001;
	private static int ITERADOR = 000001;
	
	@Getter
	@Setter
	protected int agencia;
	protected int numero;
	protected BigDecimal saldo = BigDecimal.ZERO;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Conta.ITERADOR++;
		this.cliente = cliente;
		this.cliente.cadastrarConta(this);//Alem da referencia do desafio
	}

	public BigDecimal saque(BigDecimal valor) {
		this.saldo = saldo.subtract(valor);
		return saldo;
	}
	
	public BigDecimal deposito(BigDecimal valor) {
		this.saldo = saldo.add(valor);
		return saldo;
	}
	
	public void transferencia(Conta cc, BigDecimal valor) {
		cc.saque(valor);
		this.deposito(valor);	
	}
	
	public void InformacoesDaConta() {
		System.out.println("\nTitular: " + cliente.getNome());
		System.out.println(String.format("Agencia: %04d", this.agencia));
		System.out.println(String.format("Numero:  %06d", this.numero));
		System.out.println(String.format(Locale.getDefault(), "Saldo:   %.2f", this.saldo));
	}
}
