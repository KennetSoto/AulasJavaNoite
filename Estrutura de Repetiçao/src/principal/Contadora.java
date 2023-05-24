package principal;

import java.util.Scanner;

public class Contadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		int opcao = 0;
		System.out.println("Deseja entrar no laço? ");
        System.out.println("1 = sim, 2 = não: ");
        opcao = scan.nextInt();
        
        while(opcao ==  1) {
        	contador ++;
        	System.out.println("Deseja entrar no laço?");
        	System.out.println("1 = Sim , 2 = não");
        	opcao = scan.nextInt();        	
        }
        do {
        	contador++;
        	System.out.println("Deseja entrar no laço?");
        	System.out.println("1 = Sim , 2 = não");
        	opcao = scan.nextInt();    
        } while(opcao == 1);
		System.out.println("Entrou "+contador+" vezes");
		scan.close();
		
	}

}