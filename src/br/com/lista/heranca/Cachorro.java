package br.com.lista.heranca;

import java.util.Scanner;

public class Cachorro extends SuperAnimal {
	//Exercício com poliforfismo e interface | Author: Abner Werley | Date:09/set/2021

	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	// @overrides

	@Override
	public String som(String som) {
		// TODO Auto-generated method stub
		return "latido (au au)";
	}

	public void definindoCachorro() {

		Scanner entrada = new Scanner(System.in);
		Escolhas escolha1 = new Escolhas();
		Cachorro cachorro1 = new Cachorro();

		int opcao;

		cachorro1.setNome("Cachorro");
		cachorro1.setIdade(13);
		// cachorro1.setSom("latido (au au)");
		cachorro1.setAlimentacao("carnívora");
		cachorro1.setCorrer("corre");

		System.out.println("O " + cachorro1.getNome() + " vive até " + cachorro1.getIdade() + " anos, o som que faz é o "
				+ cachorro1.som("latido (au au)") + ", sua alimentação é " + cachorro1.getAlimentacao() + " e ele "
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
