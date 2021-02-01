package simples;

public class ContaSimples extends Conta {

	private double saldoPoupanca;

	public ContaSimples() {
		super();
	}

	public ContaSimples(String banco, int agencia, int numeroconta, double saldo) {
		super(banco, agencia, numeroconta, saldo);
	}
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca > 0)
			this.saldoPoupanca = saldoPoupanca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			saldoPoupanca += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor > 0 && saldoPoupanca >= valor) {
			saldoPoupanca -= valor;
			return true;
		} else {
			return false;
		}
	}
	
}
