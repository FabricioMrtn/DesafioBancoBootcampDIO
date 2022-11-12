package modelo;

import lombok.Getter;
import lombok.Setter;

public class Cliente extends Banco{
	private static int ITERADOR = 000001;
	@Getter
	@Setter
	private int id;
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.id = ITERADOR++;;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}	
}
