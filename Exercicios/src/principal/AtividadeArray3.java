package principal;

import java.util.Random;
import java.util.Scanner;

/*
*Usando o random faça uma simulação de um sorteio, cadastrando 10 pessoas,
apenas uma pessoa será a ganhadora para a proxima turma de java do senai;
 */
public class AtividadeArray3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random randon = new Random();
		String [] participantes = new String [10];
		int numero = 0;
		int sorteio = randon.nextInt(10);
		
		System.out.println("Sorteio de um curso de Java no Senai");
		for(int cont = 0; cont < participantes.length; cont++) {
			System.out.printf("Digite o nome do %d° participantes: ",(cont+1));
			participantes [cont] = sc.nextLine();	
			numero = cont;
		}
		
		System.out.printf("O numero sorteado foi: %d",(sorteio+1));
		System.out.println();
		
		for(int cont = 0; cont < participantes.length; cont++) {
			numero = cont;
			if(numero == sorteio) {
				System.out.print("O participante sorteado foi: ");
				System.out.println(participantes[cont]);
			}
		}
		sc.close();
		}
	}


