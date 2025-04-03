package packages;

class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void vender(int quantidade) {
		if (quantidade > 0 && quantidade <= this.quantidade) {
			this.quantidade -= quantidade;
			System.out.println("Venda realizada: " + quantidade + " unidades vendidas.");
		} else {
			System.out.println("Venda não realizada. Estoque insuficiente ou quantidade inválida.");
		}
	}

	public void exibirDados() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Quantidade em estoque: " + quantidade);
	}
}
