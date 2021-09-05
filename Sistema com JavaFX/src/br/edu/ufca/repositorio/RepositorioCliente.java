package br.edu.ufca.repositorio;

import java.io.Serializable;

import br.edu.ufca.basicas.Proprietario;

public class RepositorioCliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Proprietario [] clientes;
	
	public RepositorioCliente() {
		this.clientes = new Proprietario[10];
	}

	public int adicionarCliente(Proprietario novo) {
		int i = 0;
		while(this.clientes[i] != null && i < 10) {
			i++;
		}
		if(i < 10) {
			this.clientes[i] = novo;
			return 1;
		}
		return 0;
	}

	public Proprietario [] getClientes() {
		return clientes;
	}
}
