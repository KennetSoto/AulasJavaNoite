package exTv;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Televisor televisor = new Televisor();
		
		System.out.println("Diga se a tv esta ligada: ");
		televisor.ligado = sc.hasNext();
		
		System.out.println("Diga o canal que quer assistir: ");
		televisor.canal = sc.nextInt();
		
		System.out.println("Diga o volume que gostaria: ");
		televisor.volume = sc.nextInt();
		
    sc.close();
	}

}
