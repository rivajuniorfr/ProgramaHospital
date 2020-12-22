package Futura;

public class Contafisica extends ContaHospital {

	// Atributos
	
	private  String cpf;
	
	// Construtor
	
	Contafisica(){}

	// Sobrecarga
	
	public Contafisica(int numero, String cliente, double saldo, double limite, String cpf) {
		super(numero, cliente, saldo, limite);
		this.cpf = cpf;
		
	}
	
	// ---- M�todos Getters e Setters ----

	public String getCpf() {
		return cpf;
	}

	public void setCnh(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
