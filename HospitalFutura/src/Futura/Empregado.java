package Futura;

public class Empregado extends Pessoa {
	
	// ---- Atributos ----
	
	Contafisica contaF;
	private int pis;
	private int matricula;
	
	
	// ---- M�todo Construtor ----
	
	public Empregado() {
		
		super();
	}
	
	// Sobrecarga
	
	public Empregado(String nome, String cpf, int idade, String sexo, Contafisica contaF,int pis, int matricula) {
		
		super(nome,cpf,idade,sexo);
		this.contaF = contaF;
		this.pis = pis;
		this.matricula = matricula;
		
		
	} 


	// ---- M�todos Getters e Setters ----

	public Contafisica getContaF() {
		return contaF;
	}

	public void setContaF(Contafisica contaF) {
		this.contaF = contaF;
	}
	
	public int getPis() {
		return pis;
	}
	
	public void setPis(int pis) {
		this.pis = pis;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	

}
