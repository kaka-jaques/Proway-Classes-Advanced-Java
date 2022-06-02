package br.com.entra21.javaavancado.kalil.aula02.colections;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);
	
	public static void aprender() {
		
		byte option;
		
		do {
			
			System.out.println("Escolha uma op��o");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();
			
			switch(option) {
			
			case 0:
				System.out.println("voltando ao main...");
				break;
			case 1:
				
				aprenderArrayList();
				
				break;
			case 2:
				
				aprenderLinkedList();
				
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
			
		}while(option != 0);
	}
	
	public static void aprenderArrayList(){
		
		//declara��o
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Kalil");
		nomes.add("Ciclano");
		nomes.add("Beltrano");
		nomes.add(0, "primeiro"); //substituiu
		System.out.println("Quantidade de nomes: "+nomes.size());
		
		// for de intera��o, percorre listas (foreach ctrl + espa�o)
        for (String item : nomes) {
            System.out.println("O nome no momento � " + item);
        }

 

        for (int nome = 0; nome < nomes.size(); nome++) {
            System.out.println("No �ndice " + nome + " tem o valor " + nomes.get(nome));
        }

 

        // seleciona o lugar no �ndice 0 stephanie.
        System.out.println("O primeiro nome � " + nomes.get(0));
        System.out.println("O terceiro nome � " + nomes.get(2));

 

        nomes.set(2, "Henrique atualizado");
        System.out.println("O terceiro nome � " + nomes.get(2));
        nomes.set(0, nomes.get(3).toUpperCase());
        System.out.println("O primeiro nome � " + nomes.get(0));
		
        System.out.println("Onde ser� que est� o Rubem? " + nomes.indexOf("Rubem")); //usando o index para pegar a posi��o do elemento
        System.out.println("Vou deletar quem estiver no �ndice 2 " + nomes.get(2));
        nomes.remove(2); //removendo o item no indice 2
        nomes.remove(nomes.indexOf("Rubem")); //removendo o �ndice onde o Rubem est�
        //fazendo dessa maneira consigo fazer de forma dinamica, j� que a lista est� sempre sendo alterada
        
        ArrayList<String> interesses = new ArrayList<String>();
        interesses.add("emprego melhor");
        interesses.add("formar");
        interesses.add("ter casa propria");
        interesses.add("ter carro proprio");
        
        for (String interesse : interesses) {
        	System.out.println("\t"+interesse);
		}
        
        System.out.println("Primeiro interesse � "+interesses.get(2));
        System.out.println("Segundo interesse � "+interesses.get(0));
        
        System.out.println("Posso abrir m�o de "+interesses.get(3));
        interesses.remove(3);
        System.out.println("Tamb�m posso abrir m�o de "+interesses.get(1));
        interesses.remove(interesses.indexOf("formar"));
        
        for (String interesse : interesses) {
        	System.out.println("\t"+interesse);
		}
        
	}
	
	private static void aprenderLinkedList() {
		
	}
	
}
