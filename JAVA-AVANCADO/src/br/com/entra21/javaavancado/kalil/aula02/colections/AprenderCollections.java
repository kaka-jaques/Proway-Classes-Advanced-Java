package br.com.entra21.javaavancado.kalil.aula02.colections;

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
		
	}
	
	private static void aprenderLinkedList() {
		
	}
	
}
