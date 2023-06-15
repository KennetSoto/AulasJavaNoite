package exLista;
/*
 * Crie uma classe pessoa com os atributos: nome, idade, telefone. 
 * Faça na classe principal uma lista que incremente uma nova pessoa e depois imprima todas as pessoas cadastradas.
 */

public class Contato {
	public String nome;
	public int idade;
	public String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	

}
