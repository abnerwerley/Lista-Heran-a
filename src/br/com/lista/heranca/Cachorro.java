package br.com.lista.heranca;

import java.util.Scanner;

//Exerc�cio 1 | Author: Abner Werley | Date:09/set/2021
public class Cachorro extends Animal {

	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public void definindoCachorro() {

		Scanner entrada = new Scanner(System.in);
		Escolha escolha1 = new Escolha();
		Cachorro cachorro1 = new Cachorro();

		int opcao;
		cachorro1.setNome("Cachorro");
		cachorro1.setIdade(13);
		cachorro1.setSom("latido (au au)");
		cachorro1.setAlimentacao("carn�vora");
		cachorro1.setCorrer("corre");

		System.out.println("O " + cachorro1.getNome() + " vive at� " + cachorro1.getIdade() + " e o som que faz � o "
				+ cachorro1.getSom() + " e sua alimenta��o � " + cachorro1.getAlimentacao() + " e ele "
				+ cachorro1.getCorrer() + ".");

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
