package principal;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		//Carro é o objeto, car é a variavel deste objeto
		//Carro pega a instanica da classe criada e apos '= new' cria o objeto dentro deste 
		Carro car = new Carro();
		//Carro pega a instanica da classe criada e apos '= new' cria o outro objeto (car2) dentro deste
		Carro car2 = new Carro();
		
		//atribuiçao de valores as variaveis da classe Carro
		car.modelo ="Celta";
		car.ano = 2023;
		car.cor = "vermelho";
		
		//atribuiçao de valores as variaveis da classe Carro
		car2.ano = 2022;
		car2.modelo = "Corola";
		car2.cor = "azul";
		
		//imprimindo os valores
		System.out.println("Carro: "+car.ano+" "+car.modelo+" "+car.cor);
		System.out.println("Carro: "+car2.ano+" "+car2.modelo+" "+car2.cor);
		
		

	}

}
