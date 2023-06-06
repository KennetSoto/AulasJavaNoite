package entities;

public class Conta {
	private int numConta;
	private int agencia;
	private double saldo;
	private String titular;
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void sacar(double valorSacado) {
		saldo -= valorSacado;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//uma classe quando não deriva de outra classe é uma classe pai/superclasse
	// toString é um metodo que permite alterar o descrito no retorno do local de endereço na memoria
	@Override
	public String toString() {
		return " Titular: "+titular+"\n Agencia:"+agencia+"\n Conta:"+numConta+"\n Saldo:R$"+saldo;
	}

}
