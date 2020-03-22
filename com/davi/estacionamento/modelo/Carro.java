package com.davi.estacionamento.modelo;

public class Carro {
	
	private String Nome;
	private String cor;
	private String numeroPlaca;
	private int velocidadeMx;
	
	public Carro() {
		
	}
	public int getVelocidadeMx() {
		return velocidadeMx;
	}
	public void setVelocidadeMx(int velocidadeMx) {
		this.velocidadeMx = velocidadeMx;
	}
	
	//
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//
	
	public String getNumeroPlaca() {
		return numeroPlaca;
	}
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	

}
