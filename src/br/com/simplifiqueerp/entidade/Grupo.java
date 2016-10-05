package br.com.simplifiqueerp.entidade;

import java.io.Serializable;

public class Grupo implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;

	public Grupo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}