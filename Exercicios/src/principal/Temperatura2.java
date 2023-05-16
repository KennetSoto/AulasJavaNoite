package principal;

import java.util.Scanner;

public class Temperatura2 {
			public void calculoTemp2() {
				Scanner leia = new Scanner(System.in);
				double fahrenheit;
				double celsius;
				
				System.out.println("Digite a temperatura em Celsius: ");
				celsius = leia.nextDouble();
				fahrenheit = (celsius * 1.8)+ 32;
				
				System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);
				leia.close();
			}

			public static void main(String[] args) {
				Temperatura2 obj = new Temperatura2();
				obj.calculoTemp2();
			}
}
