package br.com.entra21.javaavancado.kalil;

import java.util.Scanner;

import br.com.entra21.javaavancado.kalil.aula01.enums.PersonagemJogo;
import br.com.entra21.javaavancado.kalil.aula02.colections.AprenderCollections;
import br.com.entra21.javaavancado.kalil.aula03.Aula03;
import br.com.entra21.javaavancado.kalil.aula03.assuntos.Lembrete;

public class Main {

	static Scanner input = new Scanner(System.in);

	//Sintaxe do ENUM
	private enum DiasSemana{
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}
	
	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:

				System.out.println("Saindo");

				break;
			case 1:

				aprenderWrapper();

				break;
			case 2:

				aprenderENUM();

				break;
			case 3:
				
				AprenderCollections.aprender();
				
				break;
			case 4:
				
				Aula03.aprender();
				
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (option != 0);

	}

	private static String exibirMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em JAVA!";
		menu += "\n0 - Sair";
		menu += "\n1 - Wrapper";
		menu += "\n2 - ENUM";
		menu += "\n3 - Collections-List";
		menu += "\n4 - Datas e Annotations";
		menu += "\nEscolha uma das Opções";

		return menu;
	}

	private static void aprenderWrapper() {
		
		//sintade do Wrapper
		
		char letra = Character.valueOf('k');
		boolean verdade = Boolean.parseBoolean("true");
		boolean verdade2 = Boolean.parseBoolean("TRUE");
		boolean verdade3 = Boolean.parseBoolean("tRuE");
		boolean falso = Boolean.parseBoolean("t");
		
		byte inteoro1 = Byte.parseByte("127");
		
		short inteiro2 = Short.parseShort("128");
		
		int inteiro3 = Integer.parseInt("10000");
		
		long inteiro4 = Long.parseLong("12839138");

	}
	
	public static void aprenderENUM() {
		
		//ENUM são variaveis constantes (final) mas sem necessita de uma declaração inicial
		//Ela já é inicializada na declaração e o próprio nome dela server com valor
		
		System.out.println("Testando "+DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEXTA;
		System.out.println(hoje ?"sim":"não");
		
		//Listando os dias como se fossem vetores
		for(int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia++) +" - "+ DiasSemana.values()[dia]);
		}
		
		System.out.println("Gosto desse tipo de personagem: "+PersonagemJogo.ANAO);
		System.out.println("Gosto desse tipo de personagem: "+PersonagemJogo.ANAO+" / HP = "+PersonagemJogo.ANAO.getHP());
		System.out.println("Gosto desse tipo de personagem: "+PersonagemJogo.ANAO+" / CLASSE = "+PersonagemJogo.ANAO.getDESCRIPTION());
		
	}

}
