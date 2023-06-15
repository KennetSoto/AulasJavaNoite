package exEstoque;

public class ValorEstoque {
	public int quantidade;
	public double preco;
	public String descricao;
	
	public ValorEstoque() {
		super();
	}
	public ValorEstoque(int quantidade, double preco, String descricao) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descicao) {
		this.descricao = descicao;
	}
	
	public void adicionaProduto (int quantidade) {
		this.quantidade += quantidade; 
	}
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	public double retornaTotalEmEstoque() {
		return quantidade * preco;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto : " + descricao + "\nQuantidade: " + quantidade + "\nValor Unitario: R$"+preco+ "\nValor total em estoque: R$" + String.format("%.1f", retornaTotalEmEstoque());

	}
	
}
