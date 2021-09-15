package br.com.lista.heranca;

public class SuperAnimal implements InterfaceSom{ //a super classe implementa a interface e o override deve ser adicionado
//Exercício com poliforfismo e interface | Author: Abner Werley | Date:09/set/2021

	
	private String nome;
	private int idade;
	private String alimentacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	
	@Override
	public String som(String som) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
