package Futura;

public class Enfermeiro extends Empregado {
	
	// ---- Atributos ----
	
	private String setor;
	
	// ---- M�todo Construtor ----
	
	public Enfermeiro() {
			super();	
	}	
		
	//Sobrecarga
	
	public Enfermeiro(String nome, String cpf, int idade, String sexo, Contafisica contaF, int pis, int matricula, String setor) {
		super(nome, cpf, idade, sexo,contaF,pis,matricula);
		this.setor = setor;
		
	}
	
	// ---- M�todos Getters e Setters ----
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}
