package br.com.lista.heranca;

import java.util.Scanner;

//Exerc�cio 1 | Author: Abner Werley | Date:09/set/2021
public class Cavalo implements SuperAnimal {

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

	//@Overrides
	@Override
	public String nome(String nome) {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public int idade(int idade) {
		// TODO Auto-generated method stub
		return idade;
	}

	@Override
	public String som(String som) {
		// TODO Auto-generated method stub
		return som;
	}

	@Override
	public String alimentacao(String alimentacao) {
		// TODO Auto-generated method stub
		return alimentacao;
	}

	public void definindoCavalo() {

		Scanner entrada = new Scanner(System.in);
		Escolha escolha1 = new Escolha();
		Cavalo cavalo1 = new Cavalo();

		int opcao;

		/*
		 * cavalo1.setNome("Cavalo"); cavalo1.setIdade(30);
		 * cavalo1.setAlimentacao("herb�vora"); cavalo1.setSom("relincha (iiirrrr�)");
		 */
		cavalo1.setCorrer("corre");
		cavalo1.setTrotar("trota");

		System.out.println(
				"O " + cavalo1.nome("Cavalo") + " pode viver at� " + cavalo1.idade(30) + " anos, e tem uma alimenta��o "
						+ cavalo1.alimentacao("herb�vora") + ". Al�m de " + cavalo1.getTrotar() + " e "
						+ cavalo1.getCorrer() + " ele " + cavalo1.som("relincha (iiirrrr�)") + ".");

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
