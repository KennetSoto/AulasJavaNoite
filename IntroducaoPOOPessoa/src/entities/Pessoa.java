package entities;

public class Pessoa {
	public String nome;
	public char sexo;
	public int idade;

	//fun��es em classes s�o chamadas de metodos
	public void retornaIdade(int anoInserido) {
		idade = 2023 - anoInserido;
	}
}
