package atividadeConstrutores;
/*
 *Crie uma classe Livro onde seja obrigatório a inserção de do nome, 
 *titulo e valor do livro. Caso o livro ultrapasse o valor de  100 reais,
 *adicione uma taxa de 30% de imposto, você não poderá criar um método especifico para isso,
 *apenas os métodos get e set já existentes. Mostre os dados do livro cadastrado.
 */
public class Livro {
	public String nome;
	public String titulo;
	public double valor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor >100 ) {
			valor = (valor + 30)/100;
		}
		this.valor = valor;
	}
	public String toString() {
		return "\n Nome: "+nome+ "\n Titulo: "+titulo+ "\n Valor: R$"+valor;
	}
}
