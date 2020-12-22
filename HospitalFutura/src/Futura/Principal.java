package Futura;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Contafisica conta1 = new Contafisica(100,"Joao",1000,400,"199.999.999-99");
	Contafisica conta2 = new Contafisica(300,"Paulo",1000,4000,"299.999.999-99");
	Contafisica conta3 = new Contafisica(700,"Rivadavia",1000,4000,"399.999.999-99");
	Contafisica conta4 = new Contafisica(900,"Ricardo",1000,4000,"499.999.999-99");
	Contafisica conta5 = new Contafisica(600,"Felipe",1000,4000,"599.999.999-99");
	Contafisica conta6 = new Contafisica(400,"Bruno",1000,4000,"699.999.999-99");
	Contafisica conta7 = new Contafisica(600,"Roger",1000,4000,"799.999.999-99");
	Contafisica conta8 = new Contafisica(200,"Maria",1000,4000,"899.999.999-99");
	Medico med1 = new Medico("Rivadavia","399.999.999-99", 37, "masculino",conta3, 5678, 50070, 90087);
	Medico med2 = new Medico("Maria","899.999.999-99", 37, "feminino",conta8, 7678, 90070, 23087);
	Medico med3 = new Medico("Ricardo","199.999.999-99", 37, "masculino",conta4, 98678, 12070, 87087);
	Enfermeiro Enfermeiro1 = new Enfermeiro("Felipe","199.999.999-99", 37, "masculino",conta7, 98678, 12070,"Pediatria");
	Enfermeiro Enfermeiro2 = new Enfermeiro("Joao","199.999.999-99", 37, "masculino",conta6, 98678, 12070,"Pediatria");
	Enfermeiro Enfermeiro3 = new Enfermeiro("Roger","199.999.999-99", 37, "masculino",conta1, 98678, 12070,"Pediatria");
	Enfermeiro Enfermeiro4 = new Enfermeiro("Paulo","199.999.999-99", 37, "masculino",conta2, 98678, 12070,"Pediatria");
	Paciente paciente1 = new Paciente("Maria Jose", "199.999.999-99", 40, "feminino","Febre",med1, Enfermeiro2);
	Paciente paciente2 = new Paciente("Daniela", "199.999.999-99", 40, "feminino","Febre",med2, Enfermeiro3);
	Paciente paciente3 = new Paciente("Amanda", "199.999.999-99", 40, "feminino","Febre",med3, Enfermeiro1);
	Paciente paciente4 = new Paciente("Roberta", "199.999.999-99", 40, "feminino","Febre",med1, Enfermeiro2);
	Paciente paciente5 = new Paciente("Laura", "199.999.999-99", 40, "feminino","Febre",med1, Enfermeiro4);
	
	
	// Listas 3 M�dicos, 4 Enfermeiros e 5 Pacientes
	
	ArrayList<Medico>listaMedicos = new ArrayList<Medico>();
	listaMedicos.add(med1);
	listaMedicos.add(med2);
	listaMedicos.add(med3);
	ArrayList<Enfermeiro>listaEnfermeiros = new ArrayList<Enfermeiro>();
	listaEnfermeiros.add(Enfermeiro1);
	listaEnfermeiros.add(Enfermeiro2);
	listaEnfermeiros.add(Enfermeiro3);	
	ArrayList<Paciente>listaPacientes = new ArrayList<Paciente>();
	listaPacientes.add(paciente1);
	listaPacientes.add(paciente2);
	listaPacientes.add(paciente3);
	listaPacientes.add(paciente4);
	listaPacientes.add(paciente5);
	 
	
	// Criando Hospital
	
    Hospital h1  = new Hospital(listaPacientes,listaMedicos,listaEnfermeiros);
    
    
    // foreach
    
    for (Paciente pacientes : h1.getListaPacientes() )
    	
		if 	(pacientes.getMedico().getNome().equals("Ricardo")){
			
			System.out.println(pacientes.getNome());
		}

	} 
	
	
	
	
}

