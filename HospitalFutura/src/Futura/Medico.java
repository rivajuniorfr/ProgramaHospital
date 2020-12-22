package Futura;

public class Medico extends Empregado  {
	
	// ---- Atributos ----
	
	private int crm;
	
	// ---- M�todo Construtor ----
	
	public Medico() {
		
		super();
	}
	
	// Sobrecarga
	
	public Medico(String nome, String cpf, int idade, String sexo,Contafisica contaF, int pis, int matricula, int crm) {
		super(nome, cpf, idade, sexo, contaF, pis, matricula);
		this.crm = crm;
		
	}
	
	
	// ---- M�todos Getters e Setters ----
	
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	

}
