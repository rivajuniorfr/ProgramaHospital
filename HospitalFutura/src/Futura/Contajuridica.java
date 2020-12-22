package Futura;

import java.util.ArrayList;

public class Contajuridica extends Hospital {
	
	// Atributos
	
	private String cnpj;
	
	// Construtor
	
	public Contajuridica() {}
	
	
    // Sobrecarga
	
	public Contajuridica(ArrayList<Paciente> listaPacientes, ArrayList<Medico> listaMedicos,
			ArrayList<Enfermeiro> listaEnfermeiros, String cnpj) {
		super(listaPacientes, listaMedicos, listaEnfermeiros);
		this.cnpj = cnpj;
		
		
		
	}
	
	// Getters e Setters
	
		public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	

}
