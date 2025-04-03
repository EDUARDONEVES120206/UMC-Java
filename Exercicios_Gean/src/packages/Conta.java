package packages;

public class Conta {
	private String numero;
	private String titular;
	private double saldo;

	public Conta(String numero, String titular, double saldoInicial) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de depósito inválido.");
		}
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saque inválido. Verifique o saldo disponível.");
		}
	}

	public double getSaldo() {
		return saldo;
	}
	public void exibirDados() {
		System.out.println("Número da Conta: " + numero);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: R$ " + saldo);
	}
}
