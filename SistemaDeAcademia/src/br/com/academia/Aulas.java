package br.com.academia;

public class Aulas {
	
	private int horario; // ATRIBUTO HORARIO
	private String nome; // ATRIBUTO NOME
	
	// CONSTRUTOR DA CLASSE
	public Aulas(int horario, String nome) {
		super();
		this.horario = horario;
		this.nome = nome;
	}
	// METODO PARA INICIAR A AULA
	public void iniciarAula() {
		System.out.println("Iniciando a aula de " + nome);
	}

}
