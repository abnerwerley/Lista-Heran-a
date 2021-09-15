package br.com.lista.heranca;

import java.util.Scanner;

public class Cavalo extends SuperAnimal {
	//Exercício com poliforfismo e interface | Author: Abner Werley | Date:09/set/2021

	private String correr;
	private String trotar;
	private String montavel;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getTrotar() {
		return trotar;
	}

	public void setTrotar(String trotar) {
		this.trotar = trotar;
	}

	public String getMontavel() {
		return montavel;
	}

	public void setMontavel(String montavel) {
		this.montavel = montavel;
	}

	// @Override

	@Override
	public String som(String som) {
		// TODO Auto-generated method stub
		return som;
	}

	public void definindoCavalo() {

		Scanner entrada = new Scanner(System.in);
		Escolhas escolha1 = new Escolhas();
		Cavalo cavalo1 = new Cavalo();

		int opcao;

		cavalo1.setNome("Cavalo");
		cavalo1.setIdade(30);
		cavalo1.setAlimentacao("herbívora");
		//cavalo1.setSom("relincha (iiirrrrí)");
		cavalo1.setCorrer("corre");
		cavalo1.setTrotar("trota");

		System.out.println(
				"O " + cavalo1.getNome() + " pode viver até " + cavalo1.getIdade() + " anos, e tem uma alimentação "
						+ cavalo1.getAlimentacao() + ". Além de " + cavalo1.getTrotar() + " e "
						+ cavalo1.getCorrer() + " ele " + cavalo1.som("relincha (iiirrrrí)") + ".");

		System.out.println();
		System.out.println("Deseja ver sobre outro animal? Digite 1");
		System.out.println("Para encerrar, digite qualquer outra tecla.");
		opcao = entrada.nextInt();
		if (opcao == 1) {
			escolha1.escolhendo();
		} else {
			System.out.println("Programa encerrado, obrigado.");
		}
		entrada.close();

	}

}
