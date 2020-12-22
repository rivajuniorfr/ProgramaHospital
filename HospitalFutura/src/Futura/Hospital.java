package Futura;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital  {
	
	// Atributos
	
	private Contajuridica contaJ;
	private static ArrayList <Paciente> listaPacientes = new ArrayList<Paciente>();
	private static ArrayList <Medico> listaMedicos = new ArrayList<Medico>();
	private static ArrayList <Enfermeiro> listaEnfermeiros = new ArrayList<Enfermeiro>();
	
	// Construtor
	
	public Hospital() {}	 
	
	// Sobrecarga
	
	public Hospital(ArrayList<Paciente>listaPacientes,ArrayList<Medico>listaMedicos,ArrayList<Enfermeiro>listaEnfermeiros)  {
			
			 this.listaPacientes = listaPacientes;
			 this.listaMedicos = listaMedicos;
			 this.listaEnfermeiros = listaEnfermeiros;
			
		}
		
		
	
		// ---- M�todos Getters e Setters ----
	
		
	    public Contajuridica getContajurificada() {
		return contaJ;
	    }

	    public void setContajurificada(Contajuridica contajurificada) {
		this.contaJ = contajurificada;
	    }
	     
			     
		public static ArrayList<Paciente> getListaPacientes() {
			return listaPacientes;
		}
		
		public static void setListaPacientes(ArrayList<Paciente> listaPacientes) {
			Hospital.listaPacientes = listaPacientes;
		}

		public static ArrayList<Medico> getListaMedicos() {
			return listaMedicos;
		}

		public static void setListaMedicos(ArrayList<Medico> listaMedicos) {
			Hospital.listaMedicos = listaMedicos;
		}


		public static ArrayList<Enfermeiro> getListaEnfermeiros() {
			return listaEnfermeiros;
		}
		public static void setListaEnfermeiros(ArrayList<Enfermeiro> listaEnfermeiros) {
			Hospital.listaEnfermeiros = listaEnfermeiros;
		}

		
		
		
	


	// if (p.getmedico().getnome().equals("joao")
	
	

	

}
