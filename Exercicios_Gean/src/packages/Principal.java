package packages;

public class Principal {

	public static void main(String[] args) {
		// 1
		Livro meuLivro = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
		meuLivro.exibirInformacoes();

		// Espaçamento
		System.out.println("\n------------------------------------------------\n");

		// 2
		Aluno aluno = new Aluno("João Silva", "20231001", 8.5);
		aluno.exibirDados();

		// Espaçamento
		System.out.println("\n------------------------------------------------\n");

		// 3
		Conta conta = new Conta("12345-6", "Maria Oliveira", 1000.00);
		conta.exibirDados();

		System.out.println("\n------------------------------------------------\n");

		conta.depositar(500.00);

		System.out.println("\n------------------------------------------------\n");

		conta.sacar(200.00);

		System.out.println("\n------------------------------------------------\n");

		conta.sacar(2000.00);

		System.out.printf("\nSaldo final: R$ %.2f\n", conta.getSaldo());

		System.out.println("\n------------------------------------------------\n");

		// 4
		Produto produto = new Produto("Notebook", 3500.00, 10);
		produto.exibirDados();

		System.out.println("\n------------------------------------------------\n");

		produto.vender(3);

		System.out.println("\n------------------------------------------------\n");

		produto.vender(8);

		System.out.println("\n------------------------------------------------\n");

		produto.exibirDados();
	}

}
