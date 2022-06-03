package br.com.entra21.javaavancado.kalil.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.entra21.javaavancado.kalil.aula03.assuntos.InProgress;

public class Aula03 {

	static Scanner input = new Scanner(System.in);
	
	public static void aprender() {
		
		byte option;
		
		do {
			
			System.out.println("-1 - Sair");
			System.out.println("0 - Voltar");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			option = input.nextByte();
			
			switch(option) {
			case -1:
				
				System.out.println("Exiting...");
				System.exit(3); //exit retorna um valor pra quem chamou o programa
				
				break;
			case 0:
				
				System.out.println("Retonardo ao Menu Principal...");
				
				break;
			case 1:
				
				aprenderDatas();
				
				break;
			case 2:
				
				aprenderAnotacoes();
				
				break;
			default:
				
				
				
				break;
			}
			
		}while(option != 0);
		
	}

	private static void aprenderDatas() {
		
		Instant inicio = Instant.now();
		
		
		
		
		System.out.println("Escolha um número aleatório:");
		long numero = input.nextLong();
		
		
		
		
		Instant fim = Instant.now();
		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Você demorou "+tempo.toSeconds()+"s para escolher o número "+numero);
		System.out.println("Para datas levamos "+tempo.toSeconds()+"s");
		
		aprenderDatasHumanizadas();
		
	}

	private static void aprenderDatasHumanizadas() {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate nascimento = LocalDate.of(2001, 8, 23);
		System.out.println(nascimento);
		
		LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
		System.out.println("Essa quinta é igual a "+essaQuinta);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM YYYY");
		System.out.println(formatter.format(essaQuinta));
		System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));
		
		Period vida = Period.between(nascimento, hoje);
		System.out.println("Durante minha vida eu gastei "+vida.getYears()+" anos, "+vida.getMonths()+" meses, "+vida.getDays()+" dias, ");
		
		LocalTime lanche = LocalTime.of(20, 10);
		LocalTime finalAula = LocalTime.of(22, 15);
		LocalTime avaliacao = LocalTime.of(22, 0);
		
		System.out.println("Fomo lanchar às "+lanche+", fomos avaliar a aula às "+avaliacao+", e a aula terminar às "+finalAula);
		System.out.println("Isso no dá "+Duration.between(lanche, finalAula)+" de aula depois do lanche e "+Duration.between(avaliacao, finalAula)+" para avaliar a aula");
		
		
	}
	
	@InProgress
	private static void aprenderAnotacoes() {
		
		
		
	}
	
}


