package Futura;

public class Pessoa {
	
	// ---- Atributos ----
	
	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	
	// ---- M�todo Construtor ----
	
	public Pessoa() {
		
	}
	
	// Sobrecarga
	
	public Pessoa(String nome, String cpf, int idade, String sexo) {
	
	this.nome = nome;
	this.cpf = cpf;
	this.idade = idade;
	this.sexo = sexo;
	}

	// ---- M�todos Getters e Setters ----
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

     
	
	
	
}
