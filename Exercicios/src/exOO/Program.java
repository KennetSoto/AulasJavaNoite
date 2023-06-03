package exOO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AreaTerreno areaTerreno = new AreaTerreno();
		
		System.out.println("Digite a largura: ");
		areaTerreno.largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		areaTerreno.comprimento = sc.nextDouble();
		
		areaTerreno.calculo(areaTerreno.largura,areaTerreno.comprimento );
		System.out.println("O valor da area é: " +areaTerreno.area );
	
		sc.close();
	}
}
