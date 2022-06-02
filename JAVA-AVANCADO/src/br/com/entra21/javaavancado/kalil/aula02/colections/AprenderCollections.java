package br.com.entra21.javaavancado.kalil.aula02.colections;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);
	
	public static void aprender() {
		
		byte option;
		
		do {
			
			System.out.println("Escolha uma opção");
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
				System.out.println("Opção Inválida!");
				break;
			}
			
		}while(option != 0);
	}
	
	public static void aprenderArrayList(){
		
		//declaração
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Kalil");
		nomes.add("Ciclano");
		nomes.add("Beltrano");
		nomes.add(0, "primeiro"); //substituiu
		System.out.println("Quantidade de nomes: "+nomes.size());
		
		// for de interação, percorre listas (foreach ctrl + espaço)
        for (String item : nomes) {
            System.out.println("O nome no momento é " + item);
        }

 

        for (int nome = 0; nome < nomes.size(); nome++) {
            System.out.println("No índice " + nome + " tem o valor " + nomes.get(nome));
        }

 

        // seleciona o lugar no índice 0 stephanie.
        System.out.println("O primeiro nome é " + nomes.get(0));
        System.out.println("O terceiro nome é " + nomes.get(2));

 

        nomes.set(2, "Henrique atualizado");
        System.out.println("O terceiro nome é " + nomes.get(2));
        nomes.set(0, nomes.get(3).toUpperCase());
        System.out.println("O primeiro nome é " + nomes.get(0));
		
        System.out.println("Onde será que está o Rubem? " + nomes.indexOf("Rubem")); //usando o index para pegar a posição do elemento
        System.out.println("Vou deletar quem estiver no índice 2 " + nomes.get(2));
        nomes.remove(2); //removendo o item no indice 2
        nomes.remove(nomes.indexOf("Rubem")); //removendo o índice onde o Rubem está
        //fazendo dessa maneira consigo fazer de forma dinamica, já que a lista está sempre sendo alterada
        
        ArrayList<String> interesses = new ArrayList<String>();
        interesses.add("emprego melhor");
        interesses.add("formar");
        interesses.add("ter casa propria");
        interesses.add("ter carro proprio");
        
        for (String interesse : interesses) {
        	System.out.println("\t"+interesse);
		}
        
        System.out.println("Primeiro interesse é "+interesses.get(2));
        System.out.println("Segundo interesse é "+interesses.get(0));
        
        System.out.println("Posso abrir mão de "+interesses.get(3));
        interesses.remove(3);
        System.out.println("Também posso abrir mão de "+interesses.get(1));
        interesses.remove(interesses.indexOf("formar"));
        
        for (String interesse : interesses) {
        	System.out.println("\t"+interesse);
		}
        
	}
	
	private static void aprenderLinkedList() {
		
	}
	
}
