package principal;

import java.util.Scanner;

public class Temperatura {
	public void calculoTemp() {
		Scanner leia = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		celsius = 5*((fahrenheit-32)/9);
		
		System.out.println("A temperatura em Celsius �: "+celsius);
		leia.close();
	}

	public static void main(String[] args) {
		Temperatura obj = new Temperatura();
		obj.calculoTemp();

	}
}
