package Futura;

public class ContaHospital {

	// Atributos
	
	private int numero;
	private String cliente;
	private double saldo;
	private double limite;
	
	// Construtor
	
	ContaHospital(){}

	
	// SObrecarga
	
	public ContaHospital(int numero, String cliente, double saldo, double limite) {
		
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
	}

	// ---- M�todos Getters e Setters ----
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
	
	
}
