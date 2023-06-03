package exOO2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Digite os dados do lado 1: ");
		triangulo.area1 = sc.nextDouble();
		
		System.out.println("Digite os dados do lado 2: ");
		triangulo.area2 = sc.nextDouble();
		
		System.out.println("Digite os dados do lado 3: ");
		triangulo.area3 = sc.nextDouble();
		
		triangulo.tipoTri =triangulo.tipoTriangulo(triangulo.area1,triangulo.area2, triangulo.area3);
		System.out.printf("O triangulo é um: %s ", triangulo.tipoTri);
		
		sc.close();
	}
}
