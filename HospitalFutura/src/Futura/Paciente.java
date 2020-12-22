package Futura;


public class Paciente extends Pessoa {
	
	// ---- Atributos ----
	
	private String doenca;
	private Medico medico;
	private Enfermeiro enfermeiro;
	
	
	// ---- Construtor ----
	
	public Paciente() {
		super();
	}
	
	// ---- Sobrecarga ----
	
	public Paciente(String nome, String cpf, int idade, String sexo,String doenca,Medico medico,Enfermeiro enfermeiro) {
		
		super(nome, cpf, idade, sexo);
		this.doenca = doenca;
		this.enfermeiro = enfermeiro;
		this.medico = medico;
		
	}

	
	// ---- M�todos Getters e Setters ----

	
	
	public String getDoenca() {
		return doenca;
	}
	
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	
	
}
