package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Titular");
		conta.setTitular( sc.nextLine());
		
		System.out.println("Agencia");
		conta.setAgencia( sc.nextInt());
		
		System.out.println("Numero da Conta");
		conta.setNumConta( sc.nextInt());
		
		System.out.println("Entre com valor para depositar:");
		double deposito = sc.nextDouble();
		
		// saldo nao pode mais ser definido (setado) pois nao criei o metodo set para ele
		//conta.saldo =60000;
		conta.depositar(deposito);
		
		System.out.println("Saque o valor desejado: ");
		double saque = sc.nextDouble();
		
		conta.sacar(saque);
		
		//neste caso get pode ser usado pois foi definido na classe conta
		System.out.println("O saldo é: "+conta.getSaldo());
		
		System.out.println(conta);
		
		
        sc.close();
	}
}
