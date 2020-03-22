package com.davi.estacionamento.modelo;
import java.util.Date;

public class Vaga implements ControlaEstacionamento{
	private int numero;
	private Date horarioEntrada;
	private Date horarioSaida;
	private Carro carro;
	private double preco;
	private String cor;
	private boolean entrando;
	
	//
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(Date horerioEntrada) {
		this.horarioEntrada = horerioEntrada;
	}
	public Date getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	private boolean isEntrando() {
		return entrando;
	}
	private void setEntrando(boolean entrando) {
		this.entrando = entrando;
	}
	/////
	
	
	
	public String toString() {
		return getId() + " | " + getCarro() + " | " + getCor() + " | " + getNumero() + 
				" | " + getHorarioSaida() + " | " + getHorarioEntrada() + " | " + getPreco();
	}
	
	public Vaga imprimiDados() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean entrandoCarro() {
		// TODO Auto-generated method stub
		return false;
	}
	
	//public boolean entrandoCarro() {
	//	if(this.entrando = true ) {
	//		
	//	}
	//}

	
	

}
