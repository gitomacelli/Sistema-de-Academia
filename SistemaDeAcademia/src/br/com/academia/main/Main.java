package br.com.academia.main;

import br.com.academia.Aulas;
import br.com.academia.Equipamentos;
import br.com.academia.Instrutores;

public class Main {

	public static void main(String[] args) {
		
		Instrutores objInstrutor1 = new Instrutores("Roberto", 27);
		objInstrutor1.ajudaAluno();
		
		Aulas objAula1 = new Aulas(13, "Fitdance");
		objAula1.iniciarAula();
		
		Equipamentos objEquipamento1 = new Equipamentos("Esteira", true);
		objEquipamento1.verificarDisponibilidade(true);
	}

}
