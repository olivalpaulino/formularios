package com.dobackaofront.formularios;

public class Pessoa {
	private String nome;
	private String email;
	private String whatsapp;
	private Integer id;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String email, String whatsapp, Integer id) {
		this.nome = nome;
		this.email = email;
		this.whatsapp = whatsapp;
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	
}
