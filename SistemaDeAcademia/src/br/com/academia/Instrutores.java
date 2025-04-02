package br.com.academia;

public class Instrutores {
	
	private String nome; // ATRIBUTO NOME
	private int idade; // ATRIBUTO IDADE
	
	// CONSTRUTOR DA CLASSE
	public Instrutores(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	// METODO PARA AJUDAR O ALUNO
	public void ajudaAluno() {
		System.out.println("Instrutor ajudando o aluno");
	}
}
