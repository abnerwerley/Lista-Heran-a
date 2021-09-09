package br.com.lista.heranca;

import java.util.Scanner;

//Exercício 1 | Author: Abner Werley | Date:09/set/2021
public class Escolha {
	static int opcao;

	public void escolhendo() {

		Scanner entrada = new Scanner(System.in);
		Cachorro cachorrinho = new Cachorro();
		Cavalo cavalinho = new Cavalo();
		Preguica preguicinha = new Preguica();

		System.out.println("Olá, deseja saber sobre qual animal?");
		System.out.println("1 - Cachorro");
		System.out.println("2 - Cavalo");
		System.out.println("3 - Preguiça");
		opcao = entrada.nextInt();

		if (opcao == 1) {
			cachorrinho.definindoCachorro();
		} else if (opcao == 2) {
			cavalinho.definindoCavalo();
		} else if (opcao == 3) {
			preguicinha.definindoPreguica();
		}

		entrada.close();

	}
}
