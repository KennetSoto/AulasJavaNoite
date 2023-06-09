package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor1 = 50;
		int valor2 = 65;
		
		//final sinaliza que a variavel � uma constante
		//uma constante � quando o valor nao muda
		final double PI = 3.1415;
		
		//realiza a potencia/ primeiro � a base e depois a potencia
		System.out.println(Math.pow(2, 2));
		
		//passsagem de 2 numeros como parametro
		//retona o maior deles
		System.out.println(Math.max(valor1, valor2));
		
		//� o inverso do maior, retorna o minimo
		System.out.println(Math.min(5, 20));
		
		//retorna a raiz quadrada e um numero
		System.out.println(Math.sqrt(18));
		
		//arredonda esse numero (para mais ou menos)
		System.out.println(Math.round(25.6578));
		
		//retorna a raiz quadrada e um numero
		//podemos realizar calculos com valores 
		//retornados pelo calculo Math
		System.out.println(2+ Math.sqrt(18));
		
		//Locale permite que voce defina configura��es para diferentes idiomas,
		// pais, variantes e outras informa��es, permite que o program exiba e adapte
		Locale ponto = new Locale("en", "us");
		//neste caso para manter o padr�o, americano, e manter o ponto e n�o aceitar vigula
		
		System.out.println("Entre com valor do dolar: ");
		//recebe os dados no formato pr� definido no locale
		double dolar = leia.useLocale(ponto).nextDouble();	
		
		System.out.println("valor dolar digitado: "+ dolar);
		
		String nome= "Luan";
		char sexo ='M';
		int idade = 30;
		double altura = 1.8333338414;
		
		//No caso do printF os tipos das variaveis sao declaradas antesn no meio do texto,
		// %s para String, %c para char, %d para inteiro, %f para float/double
		// No caso do %.2f, utilizar um numero antes da letra referente a variavel, imprime 2 casas decimais apos a virgula
		System.out.printf("O meu nome � %s, sou do sexo %c, tenho %d anos, minha altura � %.2f", nome, sexo, idade, altura);
	
		
		leia.close();
		
		/*
		 * Operadores de compara��o:
		 * < maior que
		 * < menor que
		 * >= maior igual
		 * >= menor igual
		 * != diferente
		 * == igual a
		 * 		
		 */
		
		/*
		 * Operadores Logicos:
		 * && = e
		 * !! = ou
		 * ! = nega��o
		 */
	}

}
