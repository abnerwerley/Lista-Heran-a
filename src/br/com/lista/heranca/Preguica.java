package br.com.lista.heranca;

import java.util.Scanner;

//Exercício 1 | Author: Abner Werley | Date:09/set/2021
public class Preguica extends SuperAnimal {

	private String acao;
	private String curiosidade;

	public String getCuriosidade() {
		return curiosidade;
	}

	public void setCuriosidade(String curiosidade) {
		this.curiosidade = curiosidade;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	@Override
	public String som(String som) {
		// TODO Auto-generated method stub
		return som;
	}

	public void definindoPreguica() {

		Scanner entrada = new Scanner(System.in);
		Escolhas escolha1 = new Escolhas();
		Preguica preguica1 = new Preguica();

		int opcao;

		preguica1.setNome("Preguiça");
		preguica1.setIdade(50);
		preguica1.setAlimentacao("herbívora");
		// preguica1.setSom("(aá aaaáá");

		preguica1.setAcao("sobir em árvores");
		preguica1.setCuriosidade("dorme 20 horas por dia");

		System.out.println("A " + preguica1.getNome() + " vive em média " + preguica1.getIdade()
				+ " anos em seu habitat natural. Tem a alimentação " + preguica1.getAlimentacao()
				+ " e faz um som bem peculiar " + preguica1.som("(aá aaaáá") + " e sua ação é a de "
				+ preguica1.getAcao() + " e a curiosidade é que ela " + preguica1.getCuriosidade());

		System.out.println();
		System.out.println("Deseja ver sobre outro animal? Digite 1");
		System.out.println("Para encerrar, digite qualquer outra tecla.");
		opcao = entrada.nextInt();
		if (opcao == 1) {

			escolha1.getClass();
		} else {

			System.out.println("Programa encerrado, obrigado.");
		}
		entrada.close();
	}

}