package br.com.lista.heranca;

public class Animal implements InterfaceSom {

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
	public void som(String som) {
		// TODO Auto-generated method stub

	}

}
