package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//random serve para gerar caracteres aleatorios, precisa importar
		Random randon = new Random();
	
		int opcao = randon.nextInt(8)+1;
		System.out.println(opcao);
		
		/*
		switch (opcao) {
		case "Quarta-feira":
			System.out.println("O dia selecionado � Quarta ");
			break;
		case "Quinta-feira":
			System.out.println("O dia selecionado � quinta");
			break;
		case "Sexta-feira":
			System.out.println("Sextou! ");
			break;
		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
			
		}
		
		//as vezes == n�o aceita String, utilize equals no lugar de iguais
		/*if(opcao.equals("Sexta-feira")) {
			System.out.println("Sextou");
		}else
			System.out.println("N�o sextou");
		*/
		
		switch (opcao) {
		case 1:
			System.out.println("O dia selecionado � segunda ");
			break;
		case 2:
			System.out.println("O dia selecionado � ter�a");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sextou! ");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo ");
			break;
		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
			
		}
	}

}

	
