package br.edu.ufca.repositorio;

import java.io.Serializable;
import br.edu.ufca.basicas.Fazenda;

public class RepositorioFazendas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Fazenda [] fazendas;
	private int qtdFazendas;
	
	public RepositorioFazendas() {
		this.fazendas = new Fazenda[5];
		this.qtdFazendas = 0;
	}

	public void adicionarFazenda(Fazenda nova) {
		int i = 0;
		while(this.fazendas[i] != null && i < 5) {
			i++;
		}
		if(i < 5) {
			this.fazendas[i] = nova;
			this.qtdFazendas = this.getQtdFazendas() + 1;
		}
	}

	public Fazenda consultaFazenda(int id) {
		for(int i = 0; i < 5; i++) {
			if (this.fazendas[i] == null) {
				continue;
			}
			else if(this.fazendas[i].getId() == id) {
				return this.fazendas[i];
			}
		}
		return null;
	}

	public void removeFazenda(int id) {
		for (int i = 0; i < 5; i++) {
			if(this.fazendas[i] == null) {
				continue;
			}
			else if(this.fazendas[i].getId() ==  id) {
				this.fazendas[i] = null;
				this.qtdFazendas = this.getQtdFazendas() - 1;
			}
		}
	}

	public Fazenda [] getFazendas() {
		return fazendas;
	}

	public void setFazendas(Fazenda [] fazendas) {
		this.fazendas = fazendas;
	}

	public int getQtdFazendas() {
		return qtdFazendas;
	}

	public void setQtdFazendas(int qtdFazendas) {
		this.qtdFazendas = qtdFazendas;
	}
}
