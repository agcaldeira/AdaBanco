package conta;

public class ContaInvestimento extends Conta implements Investimento {

	@Override
	public void investir(double valor) {
		setSaldo(getSaldo() + valor);
		setSaldo(getSaldo() * getCliente().getRendimento());
	}

}
