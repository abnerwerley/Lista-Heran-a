package br.com.lista.heranca;

import java.util.Scanner;

public class Escolhas {

	public void escolhendo() {
		Scanner entrada = new Scanner(System.in);
		Cachorro cachorrinho = new Cachorro();
		Cavalo cavalinho = new Cavalo();
		Preguica preguicinha = new Preguica();
		int opcao;

		System.out.println(
				"Deseja agora saber sobre qual animal? " + "\n[1] Cachorro" + "\n[2] Cavalo" + "\n[3] Preguiça");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			cachorrinho.definindoCachorro();
		case 2:
			cavalinho.definindoCavalo();
		case 3:
			preguicinha.definindoPreguica();

		}

		entrada.close();
	}

}
