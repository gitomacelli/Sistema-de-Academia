package br.com.academia;

public class Equipamentos {
	 
	private String nome; // ATRIBUTO NOME
	private boolean disponibilidade; // ATRIBUTO DISPONIBILIDADE
	
	// CONSTRUTOR DA CLASSE
	public Equipamentos(String nome, boolean disponibilidade) {
		super();
		this.nome = nome;
		this.disponibilidade = disponibilidade;
	}
	
	// METODO PARA CONSULTAR A DISPONIBILIDADE DO EQUIPAMENTO
	public void verificarDisponibilidade( boolean disponibilidade) {
		if (disponibilidade){
			
			System.out.println("Equipamento " +nome+ " disponivel");
		}else {
			System.out.println("Equipamento " +nome+ " ocupado");
		}	

	}
}
